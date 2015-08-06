package templates

import model.AndroidApplication
import model.Feature

class TopicManagerTemplate implements FeatureTemplate{
	private static var TopicManagerTemplate INSTANCE = null;
	
	def static public TopicManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new TopicManagerTemplate
		return INSTANCE
	}	
	
	override generate(AndroidApplication app, Feature a) '''
/*
	Generated with DroidModeler
 */
package «app.javaName»;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;


import com.google.android.gms.gcm.GcmPubSub;


import java.io.IOException;

public class «a.name» {
	static final String TAG = "«app.name»";

    private final Context mContext;

    public PubSubHelper(Context context) {
        mContext = context;
    }

    /**
     *
     * @param senderId the project id used by the app's server
     * @param gcmToken the registration token obtained by registering
     * @param topic the topic to subscribe to
     * @param extras bundle with extra parameters
     */
    public void subscribeTopic(final String senderId, final String gcmToken,
                               final String topic, final Bundle extras) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    GcmPubSub.getInstance(mContext).subscribe(gcmToken, topic, extras);
                    Log.i(TAG, "topic subscription succeeded."
                            + "\ngcmToken: " + gcmToken
                            + "\ntopic: " + topic
                            + "\nextras: " + extras);
                    if (senderId == null) {
                    	Log.i(TAG, "Could not subscribe to topic, missing sender id");
                        return null;
                    }

                } catch (IOException | IllegalArgumentException e) {
                    Log.i(TAG, "topic subscription failed."
                            + "\nerror: " + e.getMessage()
                            + "\ngcmToken: " + gcmToken
                            + "\ntopic: " + topic
                            + "\nextras: " + extras);
                }
                return null;
            }
        }.execute();
    }

    /**
     *
     * @param senderId the project id used by the app's server
     * @param gcmToken the registration token obtained by registering
     * @param topic the topic to unsubscribe from
     */
    public void unsubscribeTopic(final String senderId, final String gcmToken, final String topic) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    GcmPubSub.getInstance(mContext).unsubscribe(gcmToken, topic);
                    Log.i(TAG, "topic unsubscription succeeded."
                            + "\ngcmToken: " + gcmToken
                            + "\ntopic: " + topic);
                    if (senderId == null) {
                        Log.i(TAG, "Could not save token, missing sender id");
                        return null;
                    }
                } catch (IOException | IllegalArgumentException e) {
                    Log.i(TAG, "topic unsubscription failed."
                            + "\nerror: " + e.getMessage()
                            + "\ngcmToken: " + gcmToken
                            + "\ntopic: " + topic);
                }
                return null;
            }
        }.execute();
    }
}	
	'''
	
}