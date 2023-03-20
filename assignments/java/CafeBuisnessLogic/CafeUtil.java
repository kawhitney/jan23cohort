import java.util.ArrayList;

public class CafeUtil {
    // get streak goal
    public static int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i=1; i<=numWeeks; i++){
            sum+=i;
        }
        return sum;
    }

    // get order total
    public static double getOrderTotal(double[] prices){
        double sum = 0;
        for(double price : prices){
            sum += price;
        }
        return sum;
    }

    // display the menu
    public static void displayMenu(ArrayList<String> items){
        for(String item : items){
            System.out.printf("%s %s\n", items.indexOf(item), item);
        }
    }

    // add customer
    public static void addCustomer(ArrayList<String> customers){
        System.out.print("Please enter your name: ");
        String customer = System.console().readLine();

        System.out.printf("Hello, %s! There are %s people ahead of you.\n", customer.trim(), customers.size());

        customers.add(customer.trim());
        System.out.print("[");
        for(String c : customers){
            if(customers.indexOf(c) == 0){
                System.out.printf("%s", c);
            }
            else{
                System.out.printf(", %s", c);
            }
        }
        System.out.print("]\n\n");
    }
}
