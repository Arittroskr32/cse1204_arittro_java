
//  preorder, inorder, postorder
//  level order
// number of nodes
// sum of all data of nodes
// height of a tree
// Diameter of a tree 

import java.util.*;

public class Binary_Tree_1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static int heightofNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightofNode(root.left);
        int rightheight = heightofNode(root.right);
        int myheight = Math.max(leftHeight, rightheight) + 1;
        return myheight;
    }

    /*
     * public static void levelorder(Node root) {
     * if (root == null) {
     * return;
     * }
     * Queue<Node> q = new LinkedList<>();
     * q.add(root);
     * q.add(null);
     * while (!q.isEmpty()) {
     * Node curr = q.remove();
     * if (curr == null) {
     * System.out.println();
     * // queue empty
     * if (q.isEmpty()) {
     * break;
     * } else {
     * q.add(null);
     * }
     * } else {
     * System.out.print(curr.data + " ");
     * if (curr.left != null) {
     * q.add(curr.left);
     * }
     * if (curr.right != null) {
     * q.add(curr.right);
     * }
     * }
     * }
     * }
     */
    public static int countofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countofNodes(root.left);
        int rightNode = countofNodes(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodesum = sumofNodes(root.left);
        int rightNodesum = sumofNodes(root.right);
        return leftNodesum + rightNodesum + root.data;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diamleft = diameter(root.left);
        int diamright = diameter(root.right);
        int diamroot = heightofNode(root.left) + heightofNode(root.right) + 1;

        return Math.max(diamroot, Math.max(diamright, diamleft));
    }

    static class Treeinfo {
        int h;
        int diam;

        Treeinfo(int h, int diam) {
            this.h = h;
            this.diam = diam;
        }
    }

    public static Treeinfo diameter2(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }
        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);
        int myheight = Math.max(left.h, right.h) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.h + right.h + 1;
        int mydiam = Math.max(diam3, Math.max(diam1, diam2));
        Treeinfo myinfo = new Treeinfo(myheight, mydiam);
        return myinfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelorder(root);
        // System.out.println(countofNodes(root));
        // System.out.println(sumofNodes(root));
        // System.out.println(heightofNode(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
