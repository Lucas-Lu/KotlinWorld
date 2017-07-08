package net.println.kt10;

/**
 * Created by luliju on 2017/7/8.
 */
public class LazyThreadSafeStaticInnerClass {

    private static class Holder{
        private static LazyThreadSafeStaticInnerClass INSTANCE = new LazyThreadSafeStaticInnerClass();
    }

    private LazyThreadSafeStaticInnerClass(){}

    public static LazyThreadSafeStaticInnerClass getInstance(){
        return Holder.INSTANCE;
    }
}
