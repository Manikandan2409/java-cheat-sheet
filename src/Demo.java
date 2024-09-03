import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j < i ? "   " : " * ");
            }
            System.out.println();
        }
        System.out.println("Triangle");
        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j < n - i) {
        // System.out.print(" ");
        // } else if (j < 2 * i - 1) {
        // System.out.print("*");
        // }
        // }

        // // for (int j = 0; j <= n - i; j++) {
        // // System.out.print(" ");
        // // }
        // // for (int j = 0; j < 2 * i - 1; j++) {
        // // System.out.print("*");
        // // }

        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j < 2 * i + 1; j++) {
        // if (j == 0 ||j == 2 * i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {

        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j < 2 * i + 1; j++) {
        // if (j == 0 || j == 2 * i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // hanoi(3,'A','B','C');

        // System.out.println(0.1 + 0.2);
        // BigDecimal bg1 = new BigDecimal(0.1);
        // BigDecimal bg2 = new BigDecimal(0.2);
        // BigDecimal res = bg1.add(bg2);
        // System.out.println(res);

        fun(2, 2);
    
    }

    static void fun(int n, int m) {
        
        if (n > 0) {
    
            fun(--n, ++m);
            System.out.print(n + "" + m);
            fun(--n, --m);
    
        }
    
    }

    static void hanoi(int tower, char start, char mid, char end) {
        if (tower == 1) {
            System.out.println(start + " -> " + end);
            return;
        }
        hanoi(tower - 1, start, end, mid);
        System.out.println(start + "  ->" + end);
        hanoi(tower - 1, mid, start, end);
    }

}
