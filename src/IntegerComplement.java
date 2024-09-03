public class IntegerComplement {
    public static void main(String[] args) {
        int num = 2;
        String numString = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char c : numString.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }

        System.out.println(numString);
        System.out.println("Complement= " + sb);

        Integer complementValue = binaryToDecimal(sb.toString());
        System.out.println("COmplemented value =" + complementValue);
    }

    static int binaryToDecimal(String binaryString) {
        int res = 0;
        int pow =0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new IllegalArgumentException();
            }

            if (binaryString.charAt(i) == '1') {
                res += Math.pow(2, pow);
            }
            pow++;
        }
        return res;
    }
}
