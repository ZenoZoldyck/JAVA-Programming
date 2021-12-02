import java.util.Scanner;
public class PostFixEval {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the postfix expression to be evaluated ");
        String exp = in.next();
        int len = exp.length();
        char[] ar = new char[len];
        for (int i = 0; i < len; i++) {
            ar[i] = exp.charAt(i);
        }
        Stack s = new Stack();
        int a, b;
        for (int i = 0; i < len; i++) {
            if (ar[i] != '+' & ar[i] != '-' & ar[i] != '*' & ar[i] != '/') {
                s.Push(ar[i] - '0');
            }
            else {
                a = s.Pop();
                b = s.Pop();
                if (ar[i] == '+') {
                    s.Push(a + b);
                }
                else if (ar[i] == '-') {
                    s.Push(b - a);
                }
                else if (ar[i] == '*') {
                    s.Push(a * b);
                }
                else {
                    s.Push(b / a);
                }
            }
        }
        System.out.println("The answer of this postfix expression is " + s.Peek());
    }
}
class Stack {
    int top = -1;
    int[] arr = new int[20];
    
    public void Push(int i) {
        if (top == 19) {
            System.out.println("Oops, stack is full");
            return;
        }
        arr[++top] = i;
    }
    
    public int Pop () {
        if (top == -1) {
            System.out.println("Oops, nothing to delete");
            return -1;
        }
        return arr[top--];
    }
    
    public int Peek() {
        if (top == -1) {
            System.out.println("Oops, stack is empty. Nothing to display");
            return -1;
        }
        return (arr[top]);
    }
}