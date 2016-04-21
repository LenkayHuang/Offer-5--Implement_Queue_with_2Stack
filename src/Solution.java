import java.util.Stack;

public class Solution {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String args[]) {
        Solution.push(1);
        Solution.push(2);
        Solution.push(3);
        System.out.print(Solution.pop());
        Solution.push(4);
        Solution.push(5);
        System.out.print(Solution.pop());
        System.out.print(Solution.pop());
        Solution.push(6);
        System.out.print(Solution.pop());
        System.out.print(Solution.pop());
        System.out.print(Solution.pop());
    }
}