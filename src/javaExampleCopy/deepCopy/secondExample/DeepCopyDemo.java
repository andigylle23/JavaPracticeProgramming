package javaExampleCopy.deepCopy.secondExample;

public class DeepCopyDemo {

    public static void main(String[] args) {
        int[] vals = {3, 15, 90};

        DeepCopy deepCopy = new DeepCopy(vals);
        deepCopy.showData();
        vals[2] = 13;
        deepCopy.showData();
    }
}
