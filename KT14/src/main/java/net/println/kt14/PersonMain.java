package net.println.kt14;

/**
 * Created by luliju on 2017/7/17.
 */
public class PersonMain {
    public static void main(String...args){
        Person someone = new Person("Lucas",24);
        System.out.println(someone.getName() + "is" + someone.age);
        someone.setName("carl");
        someone.age = 27;
        System.out.println(someone.getName()+ "is" + someone.age);
    }

}
