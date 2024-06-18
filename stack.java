class StackUsingArr {
    int arr[];
    int top;

    StackUsingArr() {
        arr = new int[100];
        top = -1;
    }

    void push(int n) {
        if (top == 99) { 
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = n;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int elt = arr[top];
        arr[top--] = 0;
        return elt;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class stack{
    public static void main(String[] args) {
        StackUsingArr ob = new StackUsingArr();
        ob.push(0);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.pop();
        ob.printStack();
    }
}
