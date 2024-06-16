// If one action is performed edit ,replace or delete so return true
// example : pale -> ple , palee, bale
package book;

public class OneAway {

    // Method one time complexity = O(n)
    private static boolean OneEditAway(String s1, String s2) {
        if(s1.length() == s2.length()){
            return oneEditReplace(s1,s2);
        }
        else if(s1.length()+1 == s2.length()){
            return oneEditInsert(s1,s2);
        }
        else if(s1.length()-1 == s2.length()){
            return oneEditInsert(s2 ,s1);
        }
        return false;
    }

    private static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index2 != index1){
                    return false;
                }
                index2++;
            }else{
                index2++;
                index1++;
            }
        }
        return true;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean oneEditAway1(String first , String second){
        //length check
        if(Math.abs(first.length() - second.length()) >1) return false;

        // longer shorter check
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(foundDifference) return false ;
                foundDifference = true;

                if(s1.length() == s2.length()){
                    index1++;
                }
            }else{
                index1++;
            }
            index2++;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "pal";
        boolean res = OneEditAway(s1,s2);
        System.out.println(res);
    }

}
