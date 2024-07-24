package basics;
import java.util.Scanner;
// Armstrong Number
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter a nuber to find a number is armstrong or not :)");
        int n = in.nextInt();
        in.close();
        if (isArmStrong(n)) {
            System.out.println(n+ " is armstrong");
        }else{ System.out.println(n+"  is not an armstrong");}
    
    }
    private static boolean isArmStrong(int n){
        int t = n;
        int s=0;
        while (n!=0) {
            int tp = n% 10;
            s+= tp* tp* tp;
            n/=10;
        }
        if (t == s) return true; 
            else return false;
    }
    
}
