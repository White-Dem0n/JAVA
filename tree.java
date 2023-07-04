package DS;

class Node {
    char key;
    Node left, right;

    Node(char key) {
        this.key = key;
    }
}

class TreeTraversal {
    Node root;

    void inorderTraversal(Node n) {
        if (n != null) {
            preorderTraversal(n.left);
            preorderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }

    void preorderTraversal(Node n) {
        if (n != null) {
            System.out.print(n.key + " ");
            preorderTraversal(n.left);
            preorderTraversal(n.right);
        }
    }

    void postorderTraversal(Node n) {
        if (n != null) {
            preorderTraversal(n.left);
            System.out.print(n.key + " ");
            preorderTraversal(n.right);
        }
    }
}

class Traversal {
    public static void main(String[] args) {

        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('1');
        t1.root.left = new Node('2');
        t1.root.right = new Node('3');
        t1.root.left.left = new Node('4');
        t1.root.left.right = new Node('5');
        t1.root.right.left = new Node('6');
        t1.root.right.right = new Node('7');

        t1.inorderTraversal(t1.root);
        System.out.println();
        t1.preorderTraversal(t1.root);
        System.out.println();
        t1.postorderTraversal(t1.root);
    }
}