//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] wordBank = {"cheese", "mayo", "burger", "ketchup", "mustard", "relish"};

        System.out.println("Guessing Word Game\n Enter a letter to start guessing");
        String letter = System.console().readLine().toLowerCase();

        do{


            System.out.println("Do you want to play again? (Y/N)");

        }while(keepPlaying());
    }

    public int wordCount(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return count;
    }

    private static boolean keepPlaying(){
        char yesorno = System.console().readLine().toLowerCase().charAt(0);

        switch (yesorno){
            case 'y':
                return true;
            case 'n':
                return false;
            default:
                System.out.println("Invalid input");

        }
        return true;
    }


}