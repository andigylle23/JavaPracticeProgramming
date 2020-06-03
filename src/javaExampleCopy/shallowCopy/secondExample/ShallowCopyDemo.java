package javaExampleCopy.shallowCopy.secondExample;

public class ShallowCopyDemo {

    public static void main(String[] args) {
        // Initial values
        int[] values = {3, 10, 6, 26 };
        // Instantiate Shallow Copy class
        ShallowCopy shallowCopy = new ShallowCopy(values);
        // Then display the initial values (original values)
        System.out.println("Original Values: ");
        shallowCopy.showData();
        // Update value based on the index
        values[2] = 13;
        System.out.println("Shallow Copy Data: ");
        // Display again the values with changes
        shallowCopy.showData();
    }
}
