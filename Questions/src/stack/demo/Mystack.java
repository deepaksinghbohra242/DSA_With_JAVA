package stack.demo;

public class Mystack {
    public static void main(String[] args) {

        Stack s = new Stack(5);
        s.push(10);
        s.push(11);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

 class Stack{
     int arr[] ;
     int cap ;
     int top;
     Stack(int c){
         cap = c;
         arr = new int[cap];
         top = -1;
     }
     void push(int x){
         top++;
         arr[top] = x;
     }
     int pop(){
         int res = arr[top];
         top--;
         return res;
     }
     int peek(){
         return arr[top];
     }
     int size(){
         return (top+1);
     }
     boolean isEmpty(){
         return (top == -1);
     }

}
