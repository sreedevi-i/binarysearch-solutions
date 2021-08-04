import java.util.*;

class MinimumStack {
Stack<int[]> stack;
    public MinimumStack() {
        this.stack = new Stack();
    }

    public void append(int val) {
        if (stack.size() == 0)
            stack.push(new int[] {val, val});
        else {
            stack.push(new int[] {val, Math.min(val, stack.peek()[1])});
        }
    }

    public int peek() {
        return stack.peek()[0];
    }

    public int min() {
        return stack.peek()[1];
    }

    public int pop() {
        return stack.pop()[0];
    }
    }
