import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreePost {
    
    static List<Integer> nodevalues = new ArrayList<>();
    
    public static void main(String[] args) {
        Node root = new Node(32);

        List<Node> rval = new ArrayList<>();
        rval.add(new Node(56));
        rval.add(new Node(67));

        List<Node> r2 = new ArrayList<>();
        r2.add(new Node(78));
        r2.add(new Node(98));
        rval.add(new Node(56, r2));

        root.children = rval;

        posttraverse(root);

        System.out.println(nodevalues); // Print the result once after traversal
    }

    static void posttraverse(Node root) {
        if (root == null) {
            return;
        }

        // Traverse all children first
        for (Node child : root.children) {
            posttraverse(child);
        }

        // Then process the current node
        nodevalues.add(root.val);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
