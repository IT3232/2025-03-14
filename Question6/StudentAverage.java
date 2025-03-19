import java.util.ArrayList;

class Student {
    String name;
    int marks;

    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

     
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 78));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 76));
        students.add(new Student("Eve", 88));

        
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }

        double average = (double) totalMarks / students.size();

       
        System.out.println("Average Marks: " + average);
    }
}