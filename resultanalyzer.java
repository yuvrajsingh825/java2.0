import java.util.Scanner;
public class resultanalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students -: ");
        int n = sc.nextInt();
        int[]marks = new int [n];
             for(int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        int max = marks[0];
        int min = marks[0];
        int failCount = 0;

        for(int i = 0; i < n; i++) {
            sum += marks[i];

            if(marks[i] > max) {
                max = marks[i];
            }

            if(marks[i] < min) {
                min = marks[i];
            }

            if(marks[i] < 33) {
                failCount++;
            }
        }

        double average = (double) sum / n;

     
        System.out.println("\n----- RESULT ANALYSIS -----");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("Number of Failed Students: " + failCount);
    }
}

    