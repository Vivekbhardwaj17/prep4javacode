package gfgSolutions;

import java.util.ArrayList;
import java.util.List;

public class createAllValidBrackets {
    public static void main(String[] args) {
        List<String> arr = getAllValidParanethesis("{}{[[][())]");
        arr.stream().forEach(System.out::println);
    }

    public static List<String> getAllValidParanethesis(String string) {
        List<String> arr = new ArrayList<>();
        arr = solveValidParan(string, "", 0, 0, 0, false, arr);
        return arr;

    }

    public static List<String> solveValidParan(String str, String ans, int openCountCurly,
                                               int openCountSqr,
                                               int openCountPar, boolean flag, List<String> arr) {
        if (openCountCurly == 0 && openCountPar == 0 && openCountSqr == 0 && ans.length() > 0 && ans.length() % 2 == 0) {
            if (!arr.contains(ans))
                arr.add(ans);
        }

        for (int i = 0; i < str.length(); i++) {
            int[] cntarr = count(ans);
            openCountCurly = cntarr[0];
            openCountSqr = cntarr[1];
            openCountPar = cntarr[2];
            flag = false;
            if (isOpen(str.charAt(i))) {
                flag = true;
                if (isOpenCurly(str.charAt(i))) {
                    openCountCurly++;
                } else if (isOpenSqr(str.charAt(i))) {
                    openCountSqr++;
                } else if (isOpenPar(str.charAt(i))) {
                    openCountPar++;
                }
            } else {
                if (isCloseCurly(str.charAt(i)) && openCountCurly > 0) {
                    openCountCurly--;
                    flag = true;
                } else if (isCloseSqr(str.charAt(i)) && openCountSqr > 0) {
                    openCountSqr--;
                    flag = true;
                } else if (isClosePar(str.charAt(i)) && openCountPar > 0) {
                    openCountPar--;
                    flag = true;
                }
            }
            if (flag) {
                solveValidParan(str.substring(i + 1), ans + str.charAt(i), openCountCurly,
                        openCountSqr,
                        openCountPar, false, arr);
            }

        }
        return arr;
    }

    public static boolean isOpen(char c) {
        if (c == '{' || c == '[' || c == '(')
            return true;
        return false;
    }

    public static boolean isOpenCurly(char c) {
        if (c == '{')
            return true;
        return false;
    }

    public static boolean isOpenSqr(char c) {
        if (c == '[')
            return true;
        return false;
    }

    public static boolean isOpenPar(char c) {
        if (c == '(')
            return true;
        return false;
    }

    public static boolean isClose(char c) {
        if (c == '}' || c == ']' || c == ')')
            return true;
        return false;
    }

    public static boolean isCloseCurly(char c) {
        if (c == '}')
            return true;
        return false;
    }

    public static boolean isCloseSqr(char c) {
        if (c == ']')
            return true;
        return false;
    }

    public static boolean isClosePar(char c) {
        if (c == ')')
            return true;
        return false;
    }

    public static int[] count(String str) {
        int one = 0, two = 0, three = 0;
        for (char c : str.toCharArray())
            if (c == '{')
                one++;
            else if (c == '}')
                one--;
            else if (c == '[')
                two++;
            else if (c == ']')
                two--;
            else if (c == '(')
                three++;
            else if (c == ')')
                three--;
        return new int[]{one, two, three};
    }
}
