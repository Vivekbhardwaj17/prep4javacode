package gfgSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AllSubstring {
    public static void main(String[] args) {
        List<String> substringList = getAllSubstring("vivek");
        substringList.stream().sorted().forEach(System.out::println);
    }
    public static List<String> getAllSubstring(String str){
        List<String> responseList = new ArrayList<>();
        int noOfSubstrings = (int)Math.pow(2,str.length());
        for (int i=0;i<noOfSubstrings;i++){
            String newStr="";
            for (int index = 0;index<str.length();index++)
                if((i&(1<<index))>0  )
                    newStr+=str.charAt(index);
            if(!responseList.contains(newStr))
                responseList.add(newStr);
        }
        return responseList;
    }
}
