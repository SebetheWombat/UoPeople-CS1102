package grocerylist;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        String item;
        int option;
        do{
            Scanner userIn = new Scanner(System.in);
            System.out.println("+---------------------------------+\n"+
                               "| Options:                        |\n" +
                               "| 1. Add item to list             |\n" + 
                               "| 2. Remove item from list        |\n" +
                               "| 3. Display list                 |\n"+
                               "| 4. Quit                         |\n"+
                               "+---------------------------------+");
            
            option = userIn.nextInt();
            switch (option){
                case 1: //Add item to list and increase array size by 1
                    System.out.print("Item to add: ");
                    item = userIn.next();
                    groceryList.add(item);
                    System.out.println(item + " added to list");
                    break;
                case 2: //Remove item from list and decrese array size by 1
                    System.out.print("Item to remove: ");
                    item = userIn.next();
                    groceryList.remove(item);
                    System.out.println(item + " removed from list");
                    break;
                case 3: //Show current size of list and items it contains
                    System.out.println("There are " + groceryList.size() + " items on your list");
                    for(int i = 0; i< groceryList.size(); i++){
                        System.out.println(i+1 + ". " + groceryList.get(i));
                    }
                    break;
                case 4: //quit
                    break;
                default: //Alert user they entered invalid input
                    System.out.println(option + " is not an option. Please type a number between 1 and 4");
                    break;
            }
            
        } while(option != 4);
    }
    
}
