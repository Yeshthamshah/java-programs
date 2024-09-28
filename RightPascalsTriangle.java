// Right Pascal’s Triangle
import java.util.*;
public class RightPascalsTriangle  {
    public static void printPattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 4;
        printPattern(n);
    }
}
