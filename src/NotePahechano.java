import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NotePahechano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        List<String> notesList = new ArrayList<String>();
        while(test -- > 0)
            notesList.add(sc.nextLine());
        checkNakliOrAsli(notesList);
    }
    public static void checkNakliOrAsli(List<String> notesList){
        int asliNoteCount =  (int) notesList.stream().filter(NotePahechano::isValidNote).distinct() .count();
        if(asliNoteCount > 0){
            System.out.println( "Asli Note: " + asliNoteCount );
            System.out.println( "Nakli Note: " + (notesList.size() - asliNoteCount) );
        }
        else
            System.out.println( "Sab Nakli Si..." );
        
    }
    public static boolean isValidNote(String note){
        if(note.length()==10)
            if(StringMethods.isNumeric(note))
                if( !note.contains( "0" ) )
                    return true;
        return false;
    }

}