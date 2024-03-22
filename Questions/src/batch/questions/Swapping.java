package batch.questions;

public class Swapping {
    static  void  swap(int a , int b){
        System.out.println("Before swaping a = "+ a + " and b = " + b);
            int temp;
            temp =a;
            a=b;
            b=temp;
        System.out.println("After swaping a = "+ a + " and b = " + b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
    }
}
