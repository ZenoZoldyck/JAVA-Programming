public class SinglyLinkedList {
    public static void main(String args[]) {
        LinkedList a = new LinkedList();
        a.insertNode(2);
        a.insertNode(4);
        a.insertNode(5);
        a.insertNode(8);
        a.insertMid(1, 2);
        a.insertNode(7);
        a.deleteNode(2);
        a.insertMid(10, 4);
        a.printList();
    }
}

class LinkedList {
    Node head;
    
    static class Node {
        int data;
        Node next;
    }
    
    public void insertNode(int a) {
        Node new_node = new Node();
        new_node.data = a;
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }
    
    public void insertMid(int a, int index) {
        Node new_node = new Node();
        new_node.data = a;
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }
    
    public void deleteNode(int a) {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if (head.data == a) {
          head = head.next;
          return;
        }
        boolean flag = false;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == a) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        }
        else {
            System.out.println("Node not found with value " + a);
        }
        
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("Sorry, the linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}