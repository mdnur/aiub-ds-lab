import java.util.Scanner;

class Node {
    public double height;
    Node next;

    public Node(double height, Node next) {
        this.height = height;
        this.next = next;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertHeight(double height) {
        Node newNode = new Node(height, head);
        head = newNode;
    }

    public double getMaximumHeight() {
        double max = 0;
        Node temp = head;
        while (temp != null) {
            if (max < temp.height)
                max = temp.height;
            temp = temp.next;
        }
        return max;
    }
}

class TreeNode {
    public double height;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(double height) {
        this.height = height;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insertHeight(double h) {
        TreeNode newNode = new TreeNode(h);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode temp = root;
        TreeNode pTemp = null;
        while (temp != null) {
            pTemp = temp;
            if (h < temp.height)
                temp = temp.left;
            else
                temp = temp.right;
        }
        if (pTemp == null) {
            pTemp = newNode;
        }

        else if (h < pTemp.height) {
            pTemp.left = newNode;
        }

        else {
            pTemp.right = newNode;
        }

    }

    public double getMaximumHeight() {
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.height;
    }
};

public class Main {
    public static void main(String[] args) {
        int n;

        LinkedList list = new LinkedList();
        BinarySearchTree bst = new BinarySearchTree();
        System.out.print("How many Person height you want to enter for LinkedList and Binary Search: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.insertHeight(input);
            bst.insertHeight(input);
        }

        sc.close();
        System.out.println("Maximum height of linked list: " + list.getMaximumHeight());
        System.out.println("Maximum height of binary search tree: " + bst.getMaximumHeight());

    }
}
/**
 * Time complexity of insert in linkedList is O(1) and TIme complexity of searching is O(n)
 * TIme complexity of insert in Binary Search Tree is (log N) and Time complexity of searching is also (log N)
 * To insert data linkedList is the best time complexity ,but for Searching Binary search has better time complexity  
 */