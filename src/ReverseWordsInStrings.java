public class ReverseWordsInStrings {
    public static void main(String[] args) {
        String val = "a good   example";
        String[] words = val.split(" ");
        String res = new String();
        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i].trim() + " ";
        }
        System.out.println(res);
    }
}
