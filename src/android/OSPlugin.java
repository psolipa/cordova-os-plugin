package com.example.OSPlugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Build;

public class OSPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getDeviceInfo")) {
            this.getDeviceInfo(callbackContext);
            return true;
        }
        return false;
    }

    private void getDeviceInfo(CallbackContext callbackContext) {
        try {
            String deviceModel = Build.MODEL;
            String devicePlatform = "Android";
            String osVersion = Build.VERSION.RELEASE;

            callbackContext.success("Model: " + deviceModel + "\nPlatform: " + devicePlatform + "\nOS Version: " + osVersion);
        } catch (Exception e) {
            callbackContext.error("An error occured: " + e.getMessage());
        }
    }
}
