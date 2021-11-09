import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    static HashMap <String, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<String> category = new ArrayList<>();
        category.add("1. Beverages");
        category.add("2. Bread / Bakery");
        category.add("3. Produce");
        category.add("4. Dairy");
        category.add("5. Meat");
        category.add("6. Frozen Foods");
        category.add("7. Personal Care");


        HashMap<String, Integer> beverageMap = new HashMap<>();
        HashMap<String, Integer> bakeryMap = new HashMap<>();
        HashMap<String, Integer> produceMap = new HashMap<>();
        HashMap<String, Integer> dairyMap = new HashMap<>();
        HashMap<String, Integer> meatMap = new HashMap<>();
        HashMap<String, Integer> frozenMap = new HashMap<>();
        HashMap<String, Integer> personalMap = new HashMap<>();


        System.out.println("Welcome! Would you like to create a grocery list? (y/n)");
            if(input.yesNo()){
                System.out.println("Awesome! Enter a category by using the category number: ");
                System.out.println(category);
                int userInput = input.getInt();

                input.getInt();

            }

    }

}

