package javaExampleCopy.shallowCopy.secondExample;

public class ShallowCopyDemo {

    public static void main(String[] args) {
        int[] vals = {3, 15, 90};

        ShallowCopy shallowCopy = new ShallowCopy(vals);
        shallowCopy.showData();
        vals[2] = 13;
        shallowCopy.showData();
    }
}
