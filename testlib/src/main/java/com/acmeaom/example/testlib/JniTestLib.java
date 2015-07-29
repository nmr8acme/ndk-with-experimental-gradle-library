package com.acmeaom.example.testlib;

public class JniTestLib {
    static {
        System.loadLibrary("test");
    }

    public static native void test();
}
