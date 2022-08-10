package lab1_Stacks;

public class Stack {
    char[] stack;
    int top;
    int size;
    public Stack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;
    }
    public void push(char item) {
        if (top == size - 1) {
            System.out.println("lab1.Stack is full");
        } else {
            top++;
            stack[top] = item;
        }
    }
    public char pop(){
        if (top == -1){
            System.out.println("lab1.Stack is empty");
            return 0;
        }
        else{
            return stack[top--];
        }
    }
    public char peek(){
        if (top == -1){
            System.out.println("lab1.Stack is empty");
            return 0;
        }
        else{
            return stack[top];
        }
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size-1);
    }
}
