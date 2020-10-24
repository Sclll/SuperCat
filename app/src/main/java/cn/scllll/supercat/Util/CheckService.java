package cn.scllll.supercat.Util;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

import static android.content.Context.ACCESSIBILITY_SERVICE;

public class CheckService {
    private static final String TAG = "CheckService.";
    private static final String SERVICE_NAME = "cn.scllll.supercat/cn.scllll.supercat.Service.AutoService";
    public static boolean checkIsOn(Context context){
        if (!(isAccessibilitySettingsOn(context)&&isAccessibilitySettingsOn(context,SERVICE_NAME))) {
            startSetting(context);
            return false;
        }
            return true;
    }


    private static void startSetting(Context context){
        Toast.makeText(context, "请手动开启无障碍服务，并打开自动赚瞄币服务", Toast.LENGTH_SHORT).show();
        Intent accessibleIntent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
        context.startActivity(accessibleIntent);
    }

    public static boolean isAccessibilitySettingsOn(Context context) {
        AccessibilityManager manager = (AccessibilityManager)context.getSystemService(ACCESSIBILITY_SERVICE);
        return manager.isEnabled();
    }

    private static boolean isAccessibilitySettingsOn(Context context, String service) {
        TextUtils.SimpleStringSplitter mStringColonSplitter = new TextUtils.SimpleStringSplitter(':');
        String settingValue = Settings.Secure.getString(
                context.getApplicationContext().getContentResolver(),
                Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES);
        if (settingValue != null) {
            mStringColonSplitter.setString(settingValue);
            while (mStringColonSplitter.hasNext()) {
                String accessibilityService = mStringColonSplitter.next();
                Log.i(TAG,accessibilityService);
                if (accessibilityService.equalsIgnoreCase(service)) {
                    return true;
                }
            }
        }
        return false;
    }
}
