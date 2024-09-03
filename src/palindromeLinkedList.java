import java.util.List;

public class palindromeLinkedList {

    public static void main(String[] args) {
        // LinkedList<Integer> values = new LinkedList<>();
        // values.add(1);
        // values.add(2);
        // // values.add(2);
        // // values.add(1);
        // System.out.println(isPalindrome(values));

        final ListNode head = new ListNode();
        head.val = 1;
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        ListNode tmp = head;
        ListNode l = head;
        int count = 0;
        while (tmp != null) {
            if (count > 1)
                l = tmp;
            System.out.print(tmp.val + " ->");

            tmp = tmp.next;
            count++;
        }
        System.out.println("Total :" + count + "  last node :" + l.val);

    }

    static boolean isPalindrome(LinkedList<Integer> values) {
    boolean isPalindrome = true;
    int left = 0;
    int right = values.size() - 1;
    while (left <= values.size() / 2) {
    if (values.get(left) != values.get(right)) {
    isPalindrome = false;
    }
    left++;
    right--;
    }
    return isPalindrome;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
