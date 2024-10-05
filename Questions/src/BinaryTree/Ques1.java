package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques1 {

    public static List<List<Integer>> maxHeightNode(Node root , List<List<Integer>> res){
        int mx = maxHeight(root);
        List<Integer> temp = new ArrayList<>();
        collectNodes(root, temp,mx,1, res);
        res.add(temp);
        return res;
    }

    private static void collectNodes(Node root,List<Integer> temp, int mx, int i , List<List<Integer>> res) {
        if(root == null ) return;
        temp.add(root.val);
        if(i == mx) res.add(new ArrayList<>(temp));
        else{
            collectNodes(root.left,temp,mx,i+1,res);
            collectNodes(root.right,temp,mx,i+1,res);
        }
        temp.remove(temp.size()-1);
    }

    private static int maxHeight(Node root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxHeight(root.left) , maxHeight(root.right)) +  1;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        Node root = new Node(20);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        res = maxHeightNode(root,res);
        for (List<Integer> r : res) {
            Collections.reverse(r);
            System.out.println(r);
        }
    }
}
