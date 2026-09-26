public class stack {
    private int[] stack;
    private int top;
    stack(int size){
        stack=new int[size];
        top=-1;
    }
    void push(int data){
        if(top==stack.length-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int data=stack[top--];
        return data;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}