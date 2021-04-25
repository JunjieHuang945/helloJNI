package top.foxhome.demo.hellojni;

public class JniUtil {
    static {
        System.loadLibrary("hello");
    }
    public static native String getInfo();
}
