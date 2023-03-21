import java.util.ArrayList;
import java.util.Date;

public class Dog {
    // === ATTRIBUTES ===
    // static attributes are shared between all dog objects
    public static int dogCount = 0;
    public static ArrayList<Dog> allDogs = new ArrayList<>();
    // non-static objects are individual to each dog object
    private String name;
    private String breed;
    private boolean goodDog = true;
    private int age; // CHALLENGE: instead, input birthdate and have age be calculated and returned in method
    private boolean houseBroken;
    private Owner owner = new Owner("Melissa");
    private ArrayList<String> toys = new ArrayList<>();

    // === METHODS ===
    //# constructor
    // passed in: string, string, int, boolean 
    public Dog(String name, String breed, int age, boolean houseBroken){
        // individual dog object
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.houseBroken = houseBroken;
        // all dogs object
        Dog.dogCount += 1;
        Dog.allDogs.add(this);
    }
    //# overloaded constructor
    // passed in: string, string, int, boolean, string
    public Dog(String name, String breed, int age, boolean houseBroken, String ownerName){
        // individual dog object
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.houseBroken = houseBroken;
        // overloaded individual pieces
        this.owner.setName(ownerName);
        // all dogs object
        Dog.dogCount += 1;
        Dog.allDogs.add(this);
    }

    //# Static Methods
    // COUNT
    // LIST

    //# Getters and Setters
    // NAME
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // BREED
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    // AGE
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // GOODDOG
    public boolean getGoodDog(){
        return this.goodDog;
    }
    public void setGoodDog(boolean goodDog) {
        this.goodDog = goodDog;
    }

    // HOUSEBROKEN
    public boolean getHouseBroken(){
        return this.houseBroken;
    }
    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }

    // OWNER 
    public String getOwner(){
        return this.owner.getName();
    }
    public void setOwner(String owner) {
        this.owner.setName(owner); 
    }

    //# Functions
    // get stats
    public String stats(){
        return String.format("Stats: %nName: %s%nAge: %s%nHousebroken: %s%nOwner: %s", this.name, this.age, this.houseBroken, this.owner.getName());
    }

    // add toy
    public void addToy(String toy){
        this.toys.add(toy);
        // can print toys here if you want
    }

    // set houseBroken true
    public void houseBreak(){
        this.setHouseBroken(true);
    }
}
