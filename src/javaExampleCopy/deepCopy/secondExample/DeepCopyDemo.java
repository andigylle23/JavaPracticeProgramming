package javaExampleCopy.deepCopy.secondExample;

public class DeepCopyDemo {

    public static void main(String[] args) {
        // Initial values
        int[] values = { 3, 10, 6, 26 };
        // Instantiate Deep Copy class
        DeepCopy deepCopy = new DeepCopy(values);
        // Then display the initial values (original values)
        System.out.println("Original Values: ");
        deepCopy.showData();
        // Update value based on the index
        values[2] = 13;
        System.out.println("Deep Copy Data: ");
        // Display again the values with changes
        deepCopy.showData();
    }
}
