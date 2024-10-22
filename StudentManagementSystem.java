import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private String name;
    private int id;
    private String course;

    public Student(int id, String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public void displayDetails() {
        System.out.println("ID:"+ id+",Name:"+ name +",Course:"+ course);
    }
}
public class StudentManagementSystem{
    private static ArrayList<Student> studentList =new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);

    private static void addStudent() {
        System.out.println("Enter Student ID:");
        int id=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Student Name:");
        String name= scanner.nextLine();

        System.out.println("Enter  Course:");
        String course=scanner.nextLine();

        Student student=new Student(id,name,course);
        studentList.add(student);
        System.out.println("Stuudent added succesfully!");
    }
    private static void viewStudents() {
        if(studentList.isEmpty()) {
            System.out.println("List of Students:");
        }else {
            System.out.println("List of Students:");
            for(Student student:studentList){
                student.displayDetails();
            }
        }
    }
    private static void deleteStudent(){
        System.out.println("Enter Students ID to delete:");
        int id=scanner.nextInt();

        boolean found=false;
        for(Student student : studentList){
            if(student.getId()==id){
                studentList.remove(student);
                System.out.println("Student with ID" + id +" removed.");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found.");
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exist");
            System.out.println("Enter your choice:");
            int choice=scanner.nextInt();

            switch (choice){
                case 1:
                  addStudent();
                   break;
                case 2:
                  viewStudents();
                  break;
                case 3:
                  deleteStudent();
                  break;
                case 4:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                default:
                   System.out.println("Invalid choice.Please try again.");
          
            }
        }
    }
}