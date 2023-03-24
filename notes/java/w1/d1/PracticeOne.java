package notes.java.w1.d1;

public class PracticeOne {
    public static void main(String[] args){
        for(int i=1; i<101; i++){
            fizzBuzz(i);
        }
    }
    // divisible by 3 print fizz
    // divisible by 5 print buzz
    // divisible by both print fizz buzz
    // else just print the number (1 to 100)
    public static void fizzBuzz(int num){
        // if(num % 3 == 0 && num % 5 == 0){
        //     System.out.println("fizz buzz");
        // }
        // else if(num % 3 == 0){
        //     System.out.println("fizz");
        // }
        // else if(num % 5 == 0){
        //     System.out.println("buzz");
        // }
        // else {
        //     System.out.println(num);
        // }
        boolean visited = false;
        if(num % 3 == 0){
            System.out.print("fizz ");
            visited = true;
        }
        if(num % 5 == 0){
            System.out.print("buzz");
            visited = true;
        }
        if(!visited){
            System.out.print(num);
        }
        System.out.print("\n");
    }
}
