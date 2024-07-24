package extras;

// Tower of Hanoii
public class TowerOfHanoii {
    public static void towerOfHanoi(int n, char start, char mid, char end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
            return;
        }
        towerOfHanoi(n - 1, start, end, mid);
        System.out.println(start + " -> " + end);
        towerOfHanoi(n - 1, mid, start, end);

    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
