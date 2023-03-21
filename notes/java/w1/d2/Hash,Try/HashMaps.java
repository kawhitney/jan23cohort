import java.util.HashMap;

public class HashMaps {
    // === HASH MAP ===
    public void orderFood(String food, String size){
        HashMap<String, Double> menuPrices = new HashMap<>();
        // have to class wraps! ie Ingeter instead of int
        // creating sizes
        menuPrices.put("Sm Basket", 2.00);
        menuPrices.put("Med Basket", 3.50);
        menuPrices.put("Lg Basket", 5.00);

        HashMap<String, Double> philly = new HashMap<>();

        System.out.println("=".repeat(30));
        switch(food.toLowerCase()){
            case "sushi":
            case "sashimi":
                System.out.println("Sorry, we are out of that.");
                break;
            default:
                System.out.printf("You ordered %s, at the cost of $%.2f %n", food, menuPrices.get(size));
                // %n == \n
        }
        System.out.println("=".repeat(30));
    }
    // === TRY CATCH ===
    public void displayWeek(){

        String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat"};
        // allows program to continue w/o erroring out
        try{
            daysOfWeek[7] = "JavaDay"; // errors out - catch triggers
            // daysOfWeek[3] = "JavaDay"; // does not error - catch does not trigger
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Well, looks like an error occured");
        }
        System.out.println("Guess what i will still print even with an error");
        for(String day : daysOfWeek){
            System.out.println(day);
        }
    }
}
