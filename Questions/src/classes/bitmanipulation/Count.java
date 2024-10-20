package classes.bitmanipulation;

public class Count {
    static int table [] = new int [256];
    static void intialise(){
        table[0] = 0;
        for(int i=1 ; i<256 ; i++){
            table[i] = (i&1) + table[i/2];
        }
    }
    static int count(int n){
        int res = table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        n = n>>8;
        res = res + table[n & 0xff];
        return res;
    }


    static int count2 (int n){
        int res = 0;
        while(n>0){
            n = (n&(n-1));
            res++;
        }
        return res;
    }

    static int count3(int n){
        int res = 0;
        while(n>0){
            if(n%2 != 0){
                res++;
            }
            n = n/2;
        }
        return res;
    }
    static int count31(int n){
        int res = 0;
        while(n>0){
            if((n&1) == 1){
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        intialise();
        System.out.println(count(10));
//        System.out.println(16>>1);
    }
}
