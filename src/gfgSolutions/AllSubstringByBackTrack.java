package gfgSolutions;

public class AllSubstringByBackTrack {

    public static void main(String[] args) {
        subs("{}{[[())]","");
    }
    public static void subs(String str,String sub){
        System.out.println(sub);
        for(int i=0;i<str.length();i++)
        subs(str.substring(i+1),sub+str.charAt(i));
    }
}
