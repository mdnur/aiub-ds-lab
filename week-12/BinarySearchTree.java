class Node {
    public int data;
    public Node left;
    public Node right;
}

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    void create(int element) {
        if (root == null) {
            root = new Node();
            root.data = element;
            root.right = null;
            root.left = null;
            return;
        }
        Node temp, r;
        temp = new Node();
        temp.data = element;
        temp.left = null;
        temp.right = null;
        r = root;

        while (r != null) {

            if (element <= r.data) {
                if (r.left == null) {
                    r.left = temp;
                    break;
                } else {
                    r = r.left;
                }
            } else if (element > r.data) {
                if (r.right == null) {
                    r.right = temp;
                    break;
                } else {
                    r = r.right;
                }

            }

        }
    }

    void insertALl(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            create(arr[i]);
        }
    }

    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left); // traverse left subtree
        System.out.println(root.data); // traverse root node
        inorder(root.right); // traverse right subtree
    }


    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        int arr[] = { 10,5,15};
        // int arr[] = { 35, 37, 49, 65, 80, 60, 40, 30, 25, 27 };
        // b.create(35);
        // b.create(37);
        // b.create(32);
        // b.create(31);
        // b.create(30);
        // b.create(35);
        // b.create(36);
        // b.create(49);
        // b.create(2);
        // b.insertALl(arr, 10);
        b.insertALl(arr, 3);
        b.inorder(b.root);

    }
}
