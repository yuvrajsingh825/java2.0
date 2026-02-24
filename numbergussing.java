  import java.util.Random;
  import java.util.*;
   
   public class numbergussing {
    public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt(100)+1;
    System.out.println("Welcome to the Number gussing game !");
    System.out.print("Select number between 1 to 100 :");
    Scanner sc = new Scanner(System.in);
    int guess = sc.nextInt();
  
    int attempts=5;
while (guess != number && attempts > 0) {
            guess = sc.nextInt();
            attempts++;

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct! Attempts: " + attempts);
        }
    }
}
