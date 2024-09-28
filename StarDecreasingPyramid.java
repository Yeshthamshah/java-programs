// Java Program to print pattern
// star decreasing pyramid 
import java.util.*;
public class StarDecreasingPyramid {
    public static void printPattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            // print new line for each row
            System.out.println();
        }
    }
    // Driver Function
    public static void main(String args[])    {
        int n = 6;
        printPattern(n);
    }
}
