import java.util.Scanner;

public class courseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a course (Java, Python, PHP) or enter 'no' to exit:");
            String chosenCourse = scanner.nextLine().toLowerCase();

            if (chosenCourse.equals("no")) {
                System.out.println("Exiting program. Thank you!");
                break;
            }

            if (chosenCourse.equals("java") || chosenCourse.equals("python") || chosenCourse.equals("php")) {
                String courseID = generateCourseID(chosenCourse);
                System.out.println("Course ID for " + chosenCourse + ": " + courseID);
            } else {
                System.out.println("Invalid course. Please choose Java, Python, or PHP.");
            }
        }

        scanner.close();
    }

    private static String generateCourseID(String course) {
        return course.substring(0, 1).toUpperCase() + (int) (Math.random() * 10000);
    }
}
