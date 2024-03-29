import java.util.*;

public class topic1 {
    public static void main(String[] args) {
        int max = -65000, min = 65000, sum = 0;
        String name;
        System.out.println("Enter your name and address:");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        String b = p.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Enter two numbers:");
        int x = p.nextInt();
        int y = p.nextInt();
        if (x > y)
            System.out.println(x + " is the big number.");
        else
            System.out.println(y + " is the big number");
        System.out.println("Enter 10 numbers");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = p.nextInt();
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            sum += arr[i];
        }
        System.out.println("Minimum number =" + min);
        System.out.println("Maximum number =" + max);
        System.out.println("Average =" + (sum / 10));
    }
}