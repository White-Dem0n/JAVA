package DS;

class node {
    char key;
    node l, r;

    node(char key) {
        this.key = key;
    }
}

class BinarySolution {
    node root;

    void insertkey(char key) {
        root = insertInTree(root, key);
    }

    node insertInTree(node root, char key) {

        if (root == null) {
            root = new node(key);
            return root;
        }
        if (key < root.key) {
            root.l = insertInTree(root.l, key);
        } else if (key > root.key) {
            root.r = insertInTree(root.r, key);
        }
        return root;

    }

    void preorderTraversal(node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderTraversal(root.l);
            preorderTraversal(root.r);
        }
    }
}

public class BST {
    public static void main(String[] args) {
        BinarySolution t = new BinarySolution();

        t.insertkey('c');
        t.insertkey('i');
        t.insertkey('b');
        t.insertkey('g');
        t.insertkey('m');
        t.insertkey('a');

        t.preorderTraversal(t.root);
    }
}
