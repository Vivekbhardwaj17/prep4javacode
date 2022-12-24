package gfgSolutions;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args) {
          getAllStringPermutaions("abc")
                  .stream()
                  .forEach(System.out::println);
    }
    public static List<String> getAllStringPermutaions(String str){
        List<String> responseList = new ArrayList<>();
       return solvePermutation(str,"",str.length(),responseList);
    }
    static List<String> solvePermutation(String ques, String ans, int len, List<String> res){
        if(ans.length()==len)
            res.add(ans);
        for (int i = 0 ;i < ques.length(); i++)
            solvePermutation(ques.substring(0,i)+ques.substring(i+1,ques.length()),
                    ans+ques.charAt(i), len, res);
        return res;
    }
}
