package net.println.kt14;

/**
 * Created by luliju on 2017/7/17.
 */
public class AccessToOverloads {
    public static void main(String...args){
        Overloads overloads = new Overloads();
        overloads.overloads(1,2,3);
        overloads.overloads(1,3);
        overloads.overloads(2);
    }
}
