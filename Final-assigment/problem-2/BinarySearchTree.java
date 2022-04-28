
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

    public int smallestElement() {
        Node temp, r;
 

        r = root;
        while (r.left != null) {

            r = r.left;
        }
        return r.data;
       
    }
    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left); 
        System.out.print(root.data+ " ");
        inorder(root.right); 
    }

    Node deleteRec(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);

      
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = smallestElement();

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        int arr[] = { 50, 30, 20,40,70,60,80};

        b.insertALl(arr, arr.length);

        b.inorder(b.root);
        b.deleteRec(b.root, 20);
        System.out.println();
        System.out.println();

        b.inorder(b.root);


    }
}
