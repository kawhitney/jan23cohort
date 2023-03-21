import java.util.HashMap;

public class Vet{
    public static void main(String[] args) {
        Dog d01 = new Dog("Mr. Tucker", "Cane Corso Mix", 1, false);
        Dog d02 = new Dog("Ollie", "Yorkie", 2, false, "Aquila"); //overloaded

        System.out.println(d01.stats());
        System.out.println("=".repeat(30));
        System.out.println(d02.stats());

        // calling statics
        // System.out.println(Dog.getDogCount());
        // System.out.println(Dog.displayAllDogInfo);

        // add a toy

        VetCharge("Annual Checkup", d02);
    }

    public static void VetCharge(String procedure, Dog dog){
        //? hash map to store vet services
        HashMap<String, Double> vetServices = new HashMap<>();
        //? Set the procudure (key) and price (value) of services
        vetServices.put("Annual Checkup", 500.00);
        vetServices.put("Pet Scan", 100.00);
        vetServices.put("Dietary Consultation", 300.00);
        // print out the procedure done
        System.out.printf("%n%s recieved a %s for %.2f and was given back to %s%n", dog.getName(), procedure, vetServices.get(procedure), dog.getOwner());
    }
}