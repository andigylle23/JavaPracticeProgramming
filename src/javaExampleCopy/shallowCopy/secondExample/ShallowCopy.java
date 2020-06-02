package javaExampleCopy.shallowCopy.secondExample;

import java.util.Arrays;

public class ShallowCopy {
    public int[] data;

    // make a shallow copy of values
    public ShallowCopy(int[] values) {
        data = values;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
