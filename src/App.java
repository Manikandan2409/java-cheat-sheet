import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
      
   
        try {
           FileReader fr = new FileReader("./resource/test.txt");
           int i;
           String s="";
           while ((i =fr.read()) !=-1) {
                System.out.print((char)i);
                s+=(char)i;
            }
            fr.close();
            FileOutputStream fw = new FileOutputStream("./resource/output.txt");
        //    BufferedWriter bw = new BufferedWriter(fw);
           for (char c : s.toCharArray()) {
            // bw.append(c);
            
           }
           System.out.println("File Writed");
          // bw.close();
           fw.close();
        } catch (Exception e) {
           e.printStackTrace();
        }


        Map<String,Integer> hmap = new HashMap<>();
        hmap.put("1", 1);
        hmap.put("2", 2);
        for (Map.Entry<String,Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            
        }
    }
}
