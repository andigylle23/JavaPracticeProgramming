package javaExampleCopy;

import javaExampleCopy.deepCopy.secondExample.DeepCopy;
import javaExampleCopy.shallowCopy.secondExample.ShallowCopy;

public class JavaCopyDemo {

    public static void main(String[] args) {
        int[] values = { 10, 20, 30 };
        ShallowCopy shallowCopy = new ShallowCopy(values);
        DeepCopy deepCopy = new DeepCopy(values);

        System.out.println("==============================");
        System.out.println("Shallow Copy: Original");
        shallowCopy.showData();

        System.out.println("Shallow Copy: Clone");
        values[2] = 300;
        shallowCopy.showData();
        System.out.println("==============================\n");


        System.out.println("==============================");
        System.out.println("Deep Copy: Original");
        deepCopy.showData();

        System.out.println("Deep Copy: Clone");
        values[2] = 300;
        deepCopy.showData();
        System.out.println("==============================\n");
    }
}
