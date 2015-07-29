package com.example.acmeaom.myapplication;

public class JniTest {
    static {
        System.loadLibrary("testapp");
    }

    public static native void test();
}
