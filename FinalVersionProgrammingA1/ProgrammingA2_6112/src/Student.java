import java.util.ArrayList;
import java.util.Scanner;

//student class to represent the model for a student and its info
class Student {
    //pri fields to store stud details
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;
//constructor was able to auto generate using ide intellij
    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }
//getters and setters auto gen with the intellij feature
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    @Override
    //method to display the stud info in format req
    public String toString() {
        return "Student ID: " + id + "\n" +
                "Student Name: " + name + "\n" +
                "Student Age: " + age + "\n" +
                "Student Email: " + email + "\n" +
                "Student Course: " + course + "\n";
    }
}

class StudentManagement {
    //array list to store student objects(copy from class work but subed stud for user)

    private ArrayList<Student> students = new ArrayList<>();

    // no usages private Scanner scanner = new Scanner(System.in);

    //mehtod to add stud to array list
    public void saveStudent(Student student) {
        students.add(student);
        System.out.println("Student details have been successfully saved.");
    }
// Method ot search for stud
    public Student searchStudent(String id) {
        //loop through array
        for (Student student : students) {
            //if the condition i smet
            if (student.getId().equals(id)) {
                //returns corresp stud
                return student;
            }
        }
        // no student is found. returning null so that i can ues it in an if state
        return null;

    }

    public boolean deleteStudent(String id) {
        //making it boolean so that when calling method it will return ture or false
        Student student = searchStudent(id);
        if (student != null) {
            //if the student exists the student will be removed from the list
            students.remove(student);
            return true;
        }
        return false;
    }

    public void printStudentDetails() {
        //if statement ot check if there are any students to print in the array
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            //count var made so that every time we loop through the array i am able to increment
            //count to represent what number stud it is as indicated in the format req
            int count = 1;
            //for loop to loop through the array
            for (Student student : students) {
                System.out.println("Student " + count);
                System.out.println("----------------------------");
                System.out.println(student);
                System.out.println("----------------------------");
                count++;
            }
        }
    }
    //method to close application that will be called if certain conditions of an if state are met

    public void exitStudentApplication() {
        System.out.println("Exiting the application...");
        System.exit(0);
    }
}

