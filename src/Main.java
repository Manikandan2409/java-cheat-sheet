public class Main {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 1; i <= 6; i++) {
            int k = 6;
            int val = 1;
            for (int j = i; j <= 6; j++) {
                if (j == i) {
                    val = +j;
                    System.out.print(val + " ");
                } else {
                    val += k+1;
                    System.out.print(val + " ");
                }
                k--;
            }
            System.out.println();
        }
    }
}