package templates

import model.JavaApplication
import model.JavaComponent

class GCMMessageManagerTemplate implements JavaComponentTemplate {
	private static var GCMMessageManagerTemplate INSTANCE = null;
	
	def static public GCMMessageManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMMessageManagerTemplate
		return INSTANCE
	}
	
	override generate(JavaApplication app, JavaComponent jc) {'''
/*
	Generated with DroidModeler
 */	
package «app.javaName»;

import java.util.Collections;
import java.util.Map;

public final class «jc.name» {

    private String collapseKey;
    private Boolean delayWhileIdle;
    private Integer timeToLive;
    private Map<String, String> data;
    private Map<String, String> notificationParams;
    private Boolean dryRun;
    private String restrictedPackageName;

    private Messagemanager(String mCollapseKey, Boolean mDelayWhileIdle, Integer mTimeToLive, Map<String, String> mData,
                           Map<String, String> mNotificationParams, Boolean mDryRun, String mRestrictedPackageName) {
        collapseKey = mCollapseKey;
        delayWhileIdle = mDelayWhileIdle;
        timeToLive = mTimeToLive;
        data = Collections.unmodifiableMap(mData);
        notificationParams = Collections.unmodifiableMap(mNotificationParams);
        dryRun = mDryRun;
        restrictedPackageName = mRestrictedPackageName;
    }

    public String getCollapseKey() {
        return collapseKey;
    }

    public Boolean isDelayWhileIdle() {
        return delayWhileIdle;
    }

    public Integer getTimeToLive() {
        return timeToLive;
    }

    public Boolean isDryRun() {
        return dryRun;
    }

    public String getRestrictedPackageName() {
        return restrictedPackageName;
    }

    public Map<String, String> getData() {
        return data;
    }

    public Map<String, String> getNotificationParams() {
        return notificationParams;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder("Message(");
        if (collapseKey != null) {
            build.append("collapseKey=").append(collapseKey).append(", ");
        }
        if (timeToLive != null) {
            build.append("timeToLive=").append(timeToLive).append(", ");
        }
        if (delayWhileIdle != null) {
            build.append("delayWhileIdle=").append(delayWhileIdle).append(", ");
        }
        if (dryRun != null) {
            build.append("dryRun=").append(dryRun).append(", ");
        }
        if (restrictedPackageName != null) {
            build.append("restrictedPackageName=").append(restrictedPackageName).append(", ");
        }
        appendMap(build, "data", data);
        appendMap(build, "notificationParams", notificationParams);
        if (build.charAt(build.length() - 1) == ' ') {
            build.delete(build.length() - 2, build.length());
        }
        build.append(")");
        return build.toString();
    }

    private void appendMap(StringBuilder builder, String name, Map<String, String> map) {
        if (!map.isEmpty()) {
            builder.append(name).append(": {");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
            }
            builder.delete(builder.length() - 1, builder.length());
            builder.append("}, ");
        }
    }

}
	
	'''
	}
	
}