package gfgSolutions;

public class ExactMatch {
    public static void main(String[] args) {
        String s1="cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu";
        String s2= "dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs";
      int ans =   coutChars(s1,s2);
        System.out.println(ans);
    }


    static int coutChars(String s1, String s2)

    {

        int n = s1.length();

        int m = s2.length();

        int[] ARR = new int[26];



        for(int i = 0; i < n; i++)

        {

            ARR[s1.charAt(i) - 'a']++;

        }

        for(int i = 0; i < m; i++)

        {

            ARR[s2.charAt(i) - 'a']--;

        }

        int count = 0;

        for(int i = 0; i < 26; i++)

        {

            count += Math.abs(ARR[i]);

        }

        return count;

    }

}
