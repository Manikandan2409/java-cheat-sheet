package extras;

class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    class Node<T> {
        T val;
        Node<T> left, right;

        Node(T val) {
            this.val = val;
            left = right = null;
        }

    }

    public void insert(T value) {
        root = insertValue(root, value);
    }

    private Node<T> insertValue(Node<T> root, T value) {
        if (root == null) {
            return new Node<T>(value);
        }

        if (value.compareTo(root.val) < 0) {
            root.left = insertValue(root.left, value);
        }

        if (value.compareTo(root.val) > 0) {
            root.right = insertValue(root.right, value);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrder(root);
        System.out.println();
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void inOrder(Node<T> root) {

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    private void postOrder(Node<T> root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    
    public boolean isHave(T value){
      return  searchInNode(root,value);
    }

    private T searchInNode(Node<T> root,T val){
          
        
        return null;

    }

    public static void main(String[] args) {
        BinaryTree<Integer> b1 = new BinaryTree<>();

        b1.insert(10);
        b1.insert(30);
        b1.insert(35);
        b1.insert(39);
        b1.insert(20);
        

        b1.inOrderTraversal();
        b1.postOrderTraversal();

    }


}
