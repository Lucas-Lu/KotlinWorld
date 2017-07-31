package net.println.kt15;

import java.util.ArrayList;

/**
 * Created by luliju on 2017/7/19.
 */
public class SAMInJava {
    private ArrayList<Runnable> runnables = new ArrayList<Runnable>();

    public void addTask(Runnable runnable){
        runnables.add(runnable);
        System.out.println("After Add：" + runnable + ", we have "+ runnables.size() + "inall.");
    }

    public void removeTask(Runnable runnable){
        runnables.remove(runnable);
        System.out.println("After Remove：" + runnable + ", we have "+ runnables.size() + "inall.");
    }
}
