import java.util.Arrays;

public class topic7 {
    public static int FindBig(int[] z) {
        int big = z[0];
        for (int i = 0; i < z.length && i < 4; i++) {
            if (big < z[i]) {
                big = z[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        int[] livingColors = { 1, 24, 76, 9, 5, 23, 99 };
        System.out.println(Arrays.toString(livingColors));
        int big = FindBig(livingColors);
        System.out.println(big);
    }
}
