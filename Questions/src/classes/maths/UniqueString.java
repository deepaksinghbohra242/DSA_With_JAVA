package classes.maths;

public class UniqueString {
    public static void main(String[] args) {
        String str = "Rachita";

        int[] store = new int[256];

        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            store[val]++;
        }

        for(int i=0;i<256;i++){
            if(store[i] > 1){
                System.out.println("False");
            }
        }




    }
}
