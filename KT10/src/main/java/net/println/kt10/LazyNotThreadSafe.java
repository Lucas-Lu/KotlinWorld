package net.println.kt10;

/**
 * Created by luliju on 2017/7/8.
 */
public class LazyNotThreadSafe {
    private static LazyNotThreadSafe INSTANCE;

    private LazyNotThreadSafe(){}

    public static LazyNotThreadSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyNotThreadSafe();
        }
        return INSTANCE;
    }
}
