public class PalindromeCheck {
    public static void main(String[] args) {
        // int num = 123;
        // int t = num;
        // int res = 0;
        // while (t != 0) {
        // int d = t % 10;
        // res = res * 10 + d;
        // t /= 10;
        // }
        // if (num == res) {
        // System.out.println("palindrome");
        // } else
        // System.out.println("not plaindrome");

        // duplicate check

        // String str = "programming";
        // byte[] freq = new byte[256];
        // for (int i = 0; i < str.length(); i++) {
        // freq[str.charAt(i)]++;
        // }
        // for (int i = 0; i < freq.length; i++) {
        // if (freq[i] >1) {
        // System.out.println((char) i +" -> "+ freq[i]);
        // }
        // }
        // missing num
        // int[] num = { 31, 32, 33, 34, 36 };
        // int actualSum = 0;
        // for (int i = 0; i < num.length; i++) {
        // actualSum += num[i];
        // }
        // int expectedSum = (6 / 2) * (num[0] + num[num.length - 1]);
        // System.out.println(actualSum + " " + expectedSum);
        // System.out.println(expectedSum - actualSum);

        // fibnocii series

        // int n =10;
        // int f =0,s =1;
        // System.out.print(f+" "+s+" ");
        // for (int i = 2; i < n; i++) {
        // int nt = f+s;
        // System.out.print(nt+" ");
        // f=s;
        // s=nt;
        // }

        // int[] nums = { 34, 23, 45, 67, 4, 67, 34, 67879, 23, 1, 23 };
        // int smallest = Integer.MAX_VALUE;
        // int highest = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        // if (smallest > nums[i]) {
        // smallest = nums[i];
        // }

        // if (highest < nums[i]) {
        // highest = nums[i];
        // }
        // }
        // System.out.println(smallest + " " + highest);

        // Third Largest
        // String str = "Hey helo";
        // StringBuilder sb = new StringBuilder();
        // char isPresent ='e';
        // char change ='k';

        // for( int i=0;i< str.length() ;i++){
        // if (str.charAt(i) == isPresent) {
        // sb.append(change);
        // }else sb.append(str.charAt(i));
        // }
        // System.out.println(sb.toString());

        // String name = "mani";
        // permutate(name, 0, name.length() - 1);
        double d = Math.round(2.5 + Math.random());
        System.out.println(d);
    }

    static void permutate(String val, int start, int end) {
        if (start == end) {
            System.out.println(val);
        }
        for (int i = start; i <= end; i++) {
            val = swap(val, start, i);
            permutate(val, start + 1, end);
            val = swap(val, start, i);

        }

    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
