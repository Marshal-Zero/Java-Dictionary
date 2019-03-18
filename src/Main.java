
import java.util.Collections;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        System.out.println("! Loading data...\n"+
                "! Loading completed...\n"+
                "-----DICTIONARY 340 JAVA-----");
         final int size = Enum.dictionaryWords.values().length;
        System.out.println(size);
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Search :");
            String name = userInput.nextLine();
            name = name.toUpperCase();


            if (name.equals("!Q")) {
                System.out.println("-----Thank You!-----");
                System.exit(0);
            } else {
                Enum.dictionaryWords search = Enum.dictionaryWords.valueOf(name);

                System.out.println(search.getType());


            }
        }

      }

}
