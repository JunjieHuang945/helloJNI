#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_top_foxhome_demo_hellojni_JniUtil_getInfo(JNIEnv *env, jclass clazz) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}


