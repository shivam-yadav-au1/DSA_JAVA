import java.util.*;

class ArrayListStack{

    List<Integer> list ;

    ArrayListStack(){
        list = new ArrayList<Integer>();
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        int index = list.size() - 1;
        int res = list.get(index);
        list.remove(index);
        return res;
    }

    public int peek(){
        int index = list.size() - 1;
        int res = list.get(index);
        return res;
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String args[]){
        ArrayListStack stack = new ArrayListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size : "+stack.size());
        System.out.println("pop  : "+stack.pop());
        System.out.println("size : "+stack.size());
        System.out.println("peek : "+stack.peek());
        System.out.println("size : "+stack.size());
        System.out.println("peek : "+stack.peek());

    }
}