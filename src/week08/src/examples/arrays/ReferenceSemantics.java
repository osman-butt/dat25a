package examples.arrays;

public class ReferenceSemantics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);
        System.out.println(arr.toString());

        // in most cases hashCode and identityHashCode are the same
        // If you override the hashCode implementation they would differ
        System.out.println(arr.hashCode());
        System.out.println(System.identityHashCode(arr));
        System.out.println(Integer.toHexString(arr.hashCode()));
    }
}
