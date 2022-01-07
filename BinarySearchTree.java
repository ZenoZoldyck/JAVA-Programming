public class BinarySearchTree {
    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.InsertNode(4);
        tree.InsertNode(2);
        tree.InsertNode(5);
        tree.InsertNode(10);
        tree.InsertNode(1);
        tree.InsertNode(3);
        tree.DisplayTree();
        tree.SearchNode(50);
    }
}

class Tree {
    node root;
    
    static class node {
        node left = null;
        int data;
        node right = null;
    }
    
    public void InsertNode (int a) {
        node new_node = new node();
        new_node.data = a;
        if (root == null) {
            root = new_node;
            return;
        }
        node temp = root;
        while (true) {
            if (temp.data >= a) {
                if (temp.left != null) {
                    temp = temp.left;
                }
                else {
                    temp.left = new_node;
                    break;
                }
            }
            else {
                if (temp.right != null) {
                    temp = temp.right;
                }
                else {
                    temp.right = new_node;
                    break;
                }
            }
        }
    }
    
    public void DisplayTree() {
        if (root == null) {
            System.out.println ("Sorry, the tree is empty");
            return;
        }
        node[] arr = new node[20];
        int rear = 0;
        int top = 0;
        arr[rear] = root;
        while (arr[top] != null) {
            System.out.print (arr[top].data + " ");
            if (arr[top].left != null) {
                arr[++rear] = arr[top].left;
            }
            if (arr[top].right != null) {
                arr[++rear] = arr[top].right;
            }
            top++;
        }
    }
    
    public void SearchNode (int a) {
        if (root == null) {
            System.out.println("Tree is empty, nothing to return");
            return;
        }
        node temp = root;
        while (temp != null) {
            if (temp.data == a) {
                break;
            }
            if (temp.data > a) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        if (temp == null) {
            System.out.println("\nOops, element not found");
        }
        else {
            System.out.println("\nElement found");
        }
    }
}