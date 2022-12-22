import java.util.Scanner;

public class TilluKiSavari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puncharCounts = new int[3];
        int villageDistanceFromCity = sc.nextInt();
        int count = 0;
        while(count < 3 )
            puncharCounts[count++] = sc.nextInt();
    }
}
