package javaExampleCopy.shallowCopy.firstExample;

import java.util.ArrayList;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cheer");
        arrayList.add("up");
        arrayList.add("Fireworks");
        arrayList.add("Festival");

        System.out.println("This is the original");
        System.out.println(arrayList);

        ArrayList<String> arrayListClone = (ArrayList<String>) arrayList.clone();

        System.out.println("This is the shallow clone");
        System.out.println(arrayListClone);
    }
}
