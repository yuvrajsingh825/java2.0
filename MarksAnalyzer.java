public class MarksAnalyzer {

    public static void main(String[] args) {

        int[] marks = {78, 85, 90, 66, 88};

        // print marks
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // calculate average
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);

        // find highest mark
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Highest Mark: " + highest);
    }
}