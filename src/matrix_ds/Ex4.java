package matrix_ds;
import java.util.*;
import java.io.*;
//Maximum num of 1's row
public class Ex4 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            System.out.println(minRow(N, M, A));
        }
    }


     static int minRow(int n, int m, int a[][]) {
        int min=Integer.MAX_VALUE;
        int index=Integer.MIN_VALUE;
        
        for(int i =0;i<n;i++){
         int c=0;   
            for(int j=0;j<m;j++){
                if(a[i][j] ==1) c++;
                
            }
            if(c<min){
                min=c;
                index =i;
            }
        }
        return index+1;
    }
}