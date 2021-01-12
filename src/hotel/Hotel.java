package hotel;
import java.util.Scanner;
import java.math.*;



public class Hotel {
    public static Scanner input = new Scanner(System.in);
    public static double total = 0;
    public static int Room = 0;
    public static double initial = 0;


    public static void main(String[] args) {
        boolean redo = true;
        int UserChoice = 0;
        while (redo == true){
            mainMenu();
            System.out.println("Do you want to book another room?"
                    + "\n1 - YES"
                    + "\n2 - NO\n");
            UserChoice = input.nextInt();
            switch (UserChoice){
                case 1:
                    redo = true;
                    break;
                case 2:
                    redo = false;
                    break;
            }
            
        }
        
    }
    
    public static void mainMenu(){
        double before = 0;
        int Days = 0;
        double Final = 0;
        System.out.println("Welcome to the hotel, what type of room would you like to stay in?"
                + "\n1 - Single Room"
                + "\n2 - Double Room"
                + "\n3 - Family Room");
        
        System.out.println("0 - Exit\n");
        
        int UserChoice = input.nextInt();
        
        switch (UserChoice){
            case 1:
                initial = initial + 50;
                break;
            case 2:
                initial = initial + 75;
                break;
            case 3:
                initial = initial + 105;
                break;
            case 0:
                System.exit(0);
        }
        
        System.out.println("\nWhat type of board would you like"
                + "\n1 - Self-Catering"
                + "\n2 - Half-Board"
                + "\n3 - Full Board");
        
        System.out.println("0 - Exit\n");
        
        UserChoice = input.nextInt();
        
        switch (UserChoice){
            case 1:
                initial = initial + 0;
                break;
            case 2:
                initial = initial + 10;
                break;
            case 3:
                initial = initial + 20;
                break;
            case 0:
                System.exit(0);
        }
        
        before = initial;
        
        
        System.out.println("How many days do you want to stay?");
        Days = input.nextInt();
        Final = initial * Days;
        
        if (Days>7) {
            Final = initial *7 ;
            for (int i = Days-7; i > 0; i--) {
                initial = initial * 0.8;
                Final = Final + initial;
            }
        }
        System.out.println("The final price came to be £"+((double)Math.round(Final * 100)/100)+".\n");
        
    }
    
    
}
