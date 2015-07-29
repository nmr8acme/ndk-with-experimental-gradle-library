package com.example.acmeaom.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.acmeaom.example.testlib.JniTestLib;

public class TestActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        JniTest.test(); // calls into app's JNI module
        JniTestLib.test(); // calls into libs JNI module
    }
}
