public class LessonOne {
    public static void main(String[] args){
        // System.out.println("Hello World!"); // Print line

        // DataTypes
        int age = 44; // an integer
        float altAge = 44.5f; // integer with decimal
        System.out.println(age); 
        System.out.println(altAge);
        System.out.println(altAge + age); // added together
        // print multiple 
        System.out.printf("%s %s\n", age, altAge);

        char c = 'a';
        String s = "This is a string."; // string is a class, must be capitalized https://www.w3schools.com/java/java_wrapper_classes.asp

        // functions
        hi();
        System.out.println(favNum(" Katie ", 42));

    }
    public static void hi(){
        System.out.println("Hello World!");
    }
    public static String favNum(String name, int num){
        //# return String.format(name + " has a favorite number of " + num); //has extra spaces when printing name
        // return String.format(name.trim() + " has a favorite number of " + num);
        return name.trim() + " has a favorite number of " + num;
    }
    public static void lessThan15(int num){
        if(num < 15){
            System.out.println("Number is less than 15");
        }
        else if(num == 15){
            System.out.println("Number is 15");
        }
        else{
            System.out.println("Number is greater than 15");
        }
    }
    // ternary expression
    public static void ternary(boolean isRaining){
        System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");
    }
    public static void nestedTernary(){
        int x=69; 
        int y=89;  
        int z=79;  
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
        System.out.println("The largest numbers is:  "+largestNumber);  
    }
    
    // switch cases!!!!!!!
    public static void switchCase(int day){
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }
    }
}

// compile with:
    // javac LessonOne.java
// then run with:
    // java LessonOne