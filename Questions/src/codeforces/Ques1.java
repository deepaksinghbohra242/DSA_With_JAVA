package codeforces;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            a = a/2;
            if(a%2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        else{
            if((a-2)%2 == 0){
                System.out.println("YES");
            }else
            System.out.println("NO");
        }

    }
}
