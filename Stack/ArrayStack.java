
class ArrayStack{

    int cap;
    int top;
    int arr[];

    ArrayStack(int cap){
        this.cap = cap;
        this.top = -1;
        arr = new int[this.cap];
    }

    public  void push(int data){
        if(top == cap -1){
            System.out.println("Stack is full");
            return;
        }
        top ++;
        arr[top] = data;
    }

    public  int pop(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top -=1;
        return res;
    }

    public  int peek(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    public  int size(){
        return  (top +1);
    }

    public  boolean isEmpty(){
        return top == -1;
    }

    public static void main(String args[]){
            ArrayStack stack = new ArrayStack(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("size : "+stack.size());
            System.out.println("pop : "+stack.pop());
            System.out.println("size : "+stack.size());
            System.out.println("peek : "+stack.peek());
    }
}