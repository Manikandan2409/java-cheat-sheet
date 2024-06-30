package basics;
 
import java.util.Scanner;
//Find power of a number
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Denominator :");
        int deno = in.nextInt();
        System.out.println("Enter the power value");
        int power = in.nextInt();

        System.out.println("Power :"+ power(deno, power));
        in.close();
    }

    static int power(int deno,int pow){
        int power =1;
        for (int i = 0; i < pow; i++) {
            power*=deno;
        }
        return power;
    }
}
