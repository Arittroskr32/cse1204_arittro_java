import java.util.Arrays;

public class topic6 {
    public static int[] InitialArray() {
        return new int[] { 2, 7, 5, 3, 8 };
    }

    public static int[] SortArray(int[] z) {
        Arrays.sort(z);
        return z;
    }

    public static void PrintArray(int[] z) {
        System.out.println("Here We Go : ");
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
        System.out.println("Done Printing The Array");
    }

    public static void main(String[] args) {
        int[] arr = InitialArray();
        PrintArray(arr);
        int[] arr2 = SortArray(arr);
        PrintArray(arr2);
    }
}
