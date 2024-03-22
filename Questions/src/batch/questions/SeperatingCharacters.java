package batch.questions;

import java.util.ArrayList;
import java.util.List;

public class SeperatingCharacters {
    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c',4,5, 'e', '6','7'};
        List<Integer> in = new ArrayList<>();
        List<Character> ch = new ArrayList<>();
        for(char ele : arr) {
            if ((ele >= 0 && ele <= 9) || (ele >= '0' && ele <= '9'))
                if (ele>=0 && ele <= 9){
                    in.add((int) ele);
                }else{
                    in.add(ele - '0');
                }
            else
                ch.add((char) ele);
        }
        System.out.println(in);
        System.out.println(ch);
    }
}
