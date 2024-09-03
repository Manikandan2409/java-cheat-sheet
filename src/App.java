import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        String col = "ABZ";

        int out = 0;
        
        for(int i = 0; i < col.length(); i++) {
            
            char currentChar = col.charAt(i);
            int value = currentChar - 'A' + 1;
            out *=26+value;
        
        }

        System.out.println(out);

    }

}
