package templates

import model.JavaApplication
import model.JavaComponent

class GCMGroupManagerTemplate implements JavaComponentTemplate{
	private static var GCMGroupManagerTemplate INSTANCE = null;
	
	def static public GCMGroupManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMGroupManagerTemplate
		return INSTANCE
	}	
	
	override generate(JavaApplication app, JavaComponent jc) {'''
/*
	Generated with DroidModeler
 */
package «app.javaName»;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class «jc.name» {

    static final String TAG = "«app.name»";

    private final Context mContext;
    private static final String GCM_GROUPS_ENDPOINT = "https://gcm-http.googleapis.com/gcm/notification";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROJECT_ID = "project_id";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String CONTENT_TYPE_JSON = "application/json";
    private SimpleArrayMap<String, String> mHeaders = new SimpleArrayMap<>();
    private int respCode;
    private String respBody;

    public GroupManager(Context context) {
        mContext = context.getApplicationContext();;
    }

    public void addMembers(String senderId, String apiKey, String groupName,
                           String groupKey, Bundle members) {
        try {
            mHeaders.put(HEADER_CONTENT_TYPE, CONTENT_TYPE_JSON);
            mHeaders.put(HEADER_AUTHORIZATION, "key=" + apiKey);
            mHeaders.put(HEADER_PROJECT_ID, senderId);

            JSONObject requestBody = new JSONObject();
            requestBody.put("operation", "add");
            requestBody.put("notification_key_name", groupName);
            requestBody.put("notification_key", groupKey);
            requestBody.put("registration_ids", new JSONArray(bundleValues2Array(members)));

            doPost(GCM_GROUPS_ENDPOINT, requestBody.toString());

            JSONObject responseBody = new JSONObject(respBody);

            if (responseBody.has("error")) {
                Log.i(TAG, "Error while adding new group members."
                        + "\ngroupName: " + groupName
                        + "\ngroupKey: " + groupKey
                        + "\nhttpResponse: " + respBody);
            } else {
                // Store the group in the local storage if necessary.
                // TODO

                Log.i(TAG, "Group members added successfully."
                        + "\ngroupName: " + groupName
                        + "\ngroupKey: " + groupKey);
            }
        } catch (JSONException | IOException e) {
            Log.i(TAG, "Exception while adding new group members."
                    + "\nerror: " + e.getMessage()
                    + "\ngroupName: " + groupName
                    + "\ngroupKey: " + groupKey);
        }
    }

    public void removeMembers(String senderId, String apiKey, String groupName,
                              String groupKey, Bundle members) {
        try {
            mHeaders.put(HEADER_CONTENT_TYPE, CONTENT_TYPE_JSON);
            mHeaders.put(HEADER_AUTHORIZATION, "key=" + apiKey);
            mHeaders.put(HEADER_PROJECT_ID, senderId);

            JSONObject requestBody = new JSONObject();
            requestBody.put("operation", "remove");
            requestBody.put("notification_key_name", groupName);
            requestBody.put("notification_key", groupKey);
            requestBody.put("registration_ids", new JSONArray(bundleValues2Array(members)));

            doPost(GCM_GROUPS_ENDPOINT, requestBody.toString());

            JSONObject responseBody = new JSONObject(respBody);

            if (responseBody.has("error")) {
                Log.i(TAG, "Error while removing group members."
                        + "\ngroupName: " + groupName
                        + "\ngroupKey: " + groupKey
                        + "\nhttpResponse: " + respBody);
            } else {
                // Store the group in the local storage if necessary.
                // TODO

                Log.i(TAG, "Group members removed successfully."
                        + "\ngroupName: " + groupName
                        + "\ngroupKey: " + groupKey);
            }
        } catch (JSONException | IOException e) {
            Log.i(TAG, "Exception while removing group members."
                    + "\nerror: " + e.getMessage()
                    + "\ngroupName: " + groupName
                    + "\ngroupKey: " + groupKey);
        }
    }


    public void asyncCreateGroup(final String senderId, final String apiKey,
                                 final String groupName, Bundle members) {
        final Bundle newMembers = new Bundle(members);
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    mHeaders.put(HEADER_CONTENT_TYPE, CONTENT_TYPE_JSON);
                    mHeaders.put(HEADER_AUTHORIZATION, "key=" + apiKey);
                    mHeaders.put(HEADER_PROJECT_ID, senderId);

                    JSONObject requestBody = new JSONObject();
                    requestBody.put("operation", "create");
                    requestBody.put("notification_key_name", groupName);
                    requestBody.put("registration_ids",
                            new JSONArray(bundleValues2Array(newMembers)));

                    doPost(GCM_GROUPS_ENDPOINT, requestBody.toString());

                    JSONObject responseBody = new JSONObject(respBody);

                    if (responseBody.has("error")) {
                        Log.i(TAG, "Group creation failed."
                                + "\ngroupName: " + groupName
                                + "\nhttpResponse:" + respBody);
                    } else {
                        // Store the group in the local storage. Notification Key Name, Notification Key, Sender Id and Client Tokens.
                        // TODO

                       Log.i(TAG, "Group creation succeeded."
                                + "\ngroupName: " + groupName
                                + "\ngroupKey: " + responseBody.getString("notification_key"));

                    }
                } catch (JSONException | IOException e) {
                    Log.i(TAG, "Exception while creating a new group"
                            + "\nerror: " + e.getMessage()
                            + "\ngroupName: " + groupName);
                }
                return null;
            }
        }.execute();
    }

    public void asyncUpdateGroup(final String senderId, final String apiKey,
                                 final String groupName, final String groupKey,
                                 Bundle newMembers, Bundle removedMembers) {
        final Bundle members2Add = new Bundle(newMembers);
        final Bundle members2Remove = new Bundle(removedMembers);
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                if (members2Add.size() > 0) {
                    addMembers(senderId, apiKey, groupName, groupKey, members2Add);
                }
                if (members2Remove.size() > 0) {
                    removeMembers(senderId, apiKey, groupName, groupKey, members2Remove);
                }
                return null;
            }
        }.execute();
    }


    private List<String> bundleValues2Array(Bundle bundle) {
        ArrayList<String> values = new ArrayList<>();
        for (String key : bundle.keySet()) {
            values.add(bundle.getString(key));
        }
        return values;
    }

    /**
     * Post the request
     * @param url where to post to
     * @param requestBody the body of the request
     * @throws IOException
     */
    public void doPost(String url, String requestBody) throws IOException {

        Log.i(TAG, "HTTP request. body: " + requestBody);

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setFixedLengthStreamingMode(requestBody.getBytes().length);
        conn.setRequestMethod("POST");
        for (int i = 0; i < mHeaders.size(); i++) {
            conn.setRequestProperty(mHeaders.keyAt(i), mHeaders.valueAt(i));
        }
        OutputStream out = null;
        try {
            out = conn.getOutputStream();
            out.write(requestBody.getBytes());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // Ignore.
                }
            }
        }

        respCode = conn.getResponseCode();

        InputStream inputStream = null;
        try {
            if (respCode == 200) {
                inputStream = conn.getInputStream();
            } else {
                inputStream = conn.getErrorStream();
            }
            respBody = getString(inputStream);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // Ignore.
                }
            }
        }

        Log.i(TAG, "HTTP response. body: " + respBody);

        conn.disconnect();
    }

    private String getString(InputStream stream) throws IOException {
        if (stream == null) {
            return "";
        }
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(stream));
        StringBuilder content = new StringBuilder();
        String newLine;
        do {
            newLine = reader.readLine();
            if (newLine != null) {
                content.append(newLine).append('\n');
            }
        } while (newLine != null);
        if (content.length() > 0) {
            // strip last newline
            content.setLength(content.length() - 1);
        }
        return content.toString();
    }

}
	
	'''
	}

	
}