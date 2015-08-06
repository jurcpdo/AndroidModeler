package templates

import model.AndroidApplication
import model.Component
import model.GCMActivity

class GCMActivityTemplate implements ComponentTemplate {
	private static var GCMActivityTemplate INSTANCE = null;
	
	def GCMActivityTemplate() {}
	
	def static public GCMActivityTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMActivityTemplate
		return INSTANCE
	}

	override generate(AndroidApplication app, Component a) '''
	«var ar = a as GCMActivity»
/*
	Generated with DroidModeler
 */
package «app.javaName»;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

enum MessageSentStatus {
	SUCCESS, FAIL;
}

public class «ar.name» extends Activity {
	static final String TAG = "«app.name»";

    public static final String EXTRA_MESSAGE = "message";
    public static final String PROPERTY_REG_ID = "registration_id";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    /**
     * TODO: substitute with your sender ID
     */
    String SENDER_ID = "FIXME";

    private GoogleCloudMessaging gcm;
    private Context context;
    private TextView mDisplay;

    private String regid;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        mDisplay = (TextView) findViewById(R.id.display);
        context = getApplicationContext();

        if (checkPlayServices()) {
            gcm = GoogleCloudMessaging.getInstance(this);
            regid = getRegistrationId(context);

            if (regid.isEmpty()) {
                registerInBackground();
            }
        } else {
            Log.i(TAG, "No valid Google Play Services APK found.");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkPlayServices();
    }


    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Log.i(TAG, "This device is not supported.");
                finish();
            }
            return false;
        }
        return true;
    }

    private void storeRegistrationId(Context context, String regId) {
        final SharedPreferences prefs = getGcmPreferences(context);
        int appVersion = getAppVersion(context);
        Log.i(TAG, "Saving regId on app version " + appVersion);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(PROPERTY_REG_ID, regId);
        editor.putInt(PROPERTY_APP_VERSION, appVersion);
        editor.commit();
    }

    private String getRegistrationId(Context context) {
        final SharedPreferences prefs = getGcmPreferences(context);
        String registrationId = prefs.getString(PROPERTY_REG_ID, "");
        if (registrationId.isEmpty()) {
            Log.i(TAG, "Registration not found.");
            return "";
        }
        int registeredVersion = prefs.getInt(PROPERTY_APP_VERSION, Integer.MIN_VALUE);
        int currentVersion = getAppVersion(context);
        if (registeredVersion != currentVersion) {
            Log.i(TAG, "App version changed.");
            return "";
        }
        return registrationId;
    }

    private void registerInBackground() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    if (gcm == null) {
                        gcm = GoogleCloudMessaging.getInstance(context);
                    }
                    regid = gcm.register(SENDER_ID);
                    sendRegistrationIdToBackend();
                    storeRegistrationId(context, regid);
                    onRegistration(SUCCESS, null);
                } catch (IOException ex) {
                    onRegistration(FAIL, ex);
                }
            }
        }.execute(null, null, null);
    }

    private String sendMessage(Bundle data) {
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... params) {
                    try {
                        String id = Integer.toString(msgId.incrementAndGet());
                        gcm.send(SENDER_ID + "@gcm.googleapis.com", id, data);
                        onMessageSent(SUCCESS, null);
                    } catch (IOException ex) {
                        onMessageSent(FAIL, ex);
                    }
                }
            }.execute(null, null, null);
    }
	«IF ar.isGroupFlag()»
	private String sendMessageGroup(Bundle data, String toGroup) {
			new AsyncTask<Void, Void, Void>() {
				@Override
				protected Void doInBackground(Void... params) {
					try {
						String id = Integer.toString(msgId.incrementAndGet());
						gcm.send(toGroup, id, data);
						onMessageSent(SUCCESS, null);
					} catch (IOException ex) {
						onMessageSent(FAIL, ex);
					}
				}
			}.execute(null, null, null);
	}
	«ENDIF»

    private static int getAppVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Could not get package name: " + e);
        }
    }

    private SharedPreferences getGcmPreferences(Context context) {
        return getSharedPreferences(DemoActivity.class.getSimpleName(),
                Context.MODE_PRIVATE);
    }

     private void onMessageSent(MessageSentStatus status, Exception ex) {
     	switch(status) {
     	case SUCCESS:
     		/* TODO */
     		break;
     	case FAIL:
     		/* TODO */
     	}
     }

     private void onRegistration(MessageSentStatus status, Exception ex) {
     	switch(status) {
     	case SUCCESS:
     		/* TODO */
     		break;
     	case FAIL:
     		/* TODO */
     	}
     }

    private void sendRegistrationIdToBackend() {
    	/* TODO: implement your custom communication here */
    }
}
'''
}
