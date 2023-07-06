package com.movetobackground;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = MoveToBackgroundModule.NAME)
public class MoveToBackgroundModule extends ReactContextBaseJavaModule {
  public static final String NAME = "MoveToBackground";

  public MoveToBackgroundModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void moveToBackground() {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      activity.moveTaskToBack(true);
    } else {
        Log.e("MoveToBackgroundPlugin", "moveToBackground failed: activity=null");
      }
  }
}
