package matrix_ds;

// matrix 90 deg
public class Ex3 {
    public static void main(String[] args) {
       int size =3;
        int matrix[][] 
                    = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

                    for (int i = 0; i < size; i++) {
                        for (int j = i; j < size; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[j][i];
                            matrix[j][i] = temp;
                        }
                    }
            
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size / 2; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][size - j - 1];
                            matrix[i][size - j - 1] = temp;
                        }
                    }
            
        System.out.println("Result");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }
        
    }
}
