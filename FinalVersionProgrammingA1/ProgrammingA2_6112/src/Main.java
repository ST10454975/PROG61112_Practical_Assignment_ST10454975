import java.util.Scanner;

public class Main {
    // creating an instance of the student management class to use its methods
    //learned this at prasad kadu (2021) available at https://www.youtube.com/watch?v=YjjwfIbZQTs&t=419s&pp=ygU2aG93IHRvIGdldCBhIHVzZXIgdG8gZmlsbCBpbiBvYmplY3QgYXR0cmlidXRlcyBpbiBqYXZh

    private static StudentManagement management = new StudentManagement();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //while ture 2 execute  the code until the user input is not = 1
        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("****************************************************");
            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            String option = scanner.nextLine();

            if (!option.equals("1")) {
                // the condition is met we will call the close application methoed
                management.exitStudentApplication();
            }
            //if the condition is not met the display menu method will be called

            displayMenu();
        }
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new student");
            System.out.println("(2) Search for a student");
            System.out.println("(3) Delete a student");
            System.out.println("(4) Print student details");
            System.out.println("(5) Exit application");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            //switch state used (esier to understand than if state and less code needed)

            switch (choice) {
                //for every case that is selected i will call the corresp method
                case "1":
                    captureNewStudent();
                    break;
                case "2":
                    searchForStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    management.printStudentDetails();
                    break;
                case "5":
                    management.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            String option = scanner.nextLine();
            if (!option.equals("1")) {
                //if condition is met the application will close if not then the code will be executed agian becasue of while ture

                management.exitStudentApplication();
            }
        }
    }

    public static void captureNewStudent() {
        //method to capture a stud with req formating
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************************************");
        System.out.print("Enter the student id: ");
        String id = scanner.nextLine();
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        int age = 0;
        while (true) {
            // uding try catch cause if the user enters a word for age this wil cause an exception when trying to parse an word into a int
            //learned this form Coding With John (2021) exception handling in java tutorial available at https://www.youtube.com/watch?v=1XAfapkBQjk&pp=ygUaZXhjZXB0aW9uIGhhbmRsaW5nIGluIGphdmE%3D

            try {
                System.out.print("Enter the student age: ");
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("Invalid age. Please enter an age greater than or equal to 16.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();
        //student object to apply the captured info to
        Student student = new Student(id, name, age, email, course);
        //saving the above stud object using the save stud method
        management.saveStudent(student);
    }

    public static void searchForStudent() {
        System.out.print("Enter the student id to search: ");
        String id = scanner.nextLine();
        //searching for
        Student student = management.searchStudent(id);

        if (student != null) {
            // using the null as stated in the student class
            System.out.println("---------------------------------------------------");
            System.out.println(student);
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("Student with student ID: " + id + " was not found!");
            System.out.println("---------------------------------------------------");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter the student ID to delete: ");
        String id = scanner.nextLine();
        System.out.print("Are you sure you want to delete student with ID " + id + " from the system? Yes (y) to delete: ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("y")) {
            //if the valure in conformation meets condition following cod ewill be executed

            boolean isDeleted = management.deleteStudent(id);
            //setting var isdeleted to the boolean result of the method (if the stud was
            //successfully deleted then var isdeleted will be set to true and vise versa)

            if (isDeleted) {
                //basically if isdeleted is ture
                System.out.println("-----------------------------------------------------------");
                System.out.println("Student with ID " + id + " was deleted.");
                System.out.println("-----------------------------------------------------------");
            } else {
                //is false
                System.out.println("-----------------------------------------------------------");
                System.out.println("Student with ID " + id + " was not found.");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}