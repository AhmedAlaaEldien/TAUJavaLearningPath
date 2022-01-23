import java.util.Scanner;

public class SearchOnText {

    public static Scanner scanner;

    public static void main(String[] args){

        scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Text! ^_^");
        String text = scanner.nextLine();
        System.out.println("Enter Your Letter You Need To Search For");
        char letter = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Is The Letter Found on the Text?    " + SearchOnText.Searcher(text, letter));

    }

    public static boolean Searcher(String searchText, char searchLetter){

        boolean letterFound= false;

        for(int i=0; i< searchText.length(); i++){
            char currentLetter = searchText.charAt(i);
            if(currentLetter == Character.toUpperCase(searchLetter) || currentLetter == Character.toLowerCase(searchLetter) ){
                letterFound = true;
                break;
            }
        }

        return letterFound;
    }

}
