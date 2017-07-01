package net.println.kt05;

/**
 * Created by luliju on 2017/7/1.
 */
public class Main {
    public static void main(String... args){
        for(String arg : args){
            String[] argArray = arg.split("_");
            for(String ar:argArray ){
                System.out.print(ar);
                System.out.print(" ");
            }
        }
    }
}
