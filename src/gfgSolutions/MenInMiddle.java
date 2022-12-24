package gfgSolutions;

public class MenInMiddle {
    public static void main(String[] args) {
        String str = "1234";
        solve(str,"",str.length(),0);
    }
    static void solve(String str,String ans,int cnt,int cn){
        if(ans.length()==cnt)System.out.println(ans);
        // if (!ls.contains(ans))
        //  ls.add(ans);

        for(int i=0;i<str.length();i++){
            cn++;
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                solve(str.substring(i+1,str.length()),ans+Character.toUpperCase(str.charAt(i)),cnt,cn);
            solve(str.substring(i+1,str.length()),ans+(str.charAt(i)),cnt,cn);


        }


        // return ls;
    }
}
