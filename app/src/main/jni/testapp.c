#include <jni.h>
#include <android/log.h>

JNIEXPORT void JNICALL
Java_com_example_acmeaom_myapplication_JniTest_test(JNIEnv *env, jclass type) {
    __android_log_print(ANDROID_LOG_DEBUG, "testapp", "test");
}