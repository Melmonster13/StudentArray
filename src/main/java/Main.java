import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList for storing student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects
        students.add(new Student(103, "Charles", "123 Walnut St"));
        students.add(new Student(101, "Amanda", "234 Pine St"));
        students.add(new Student(105, "Freddy", "1428 Elm St"));
        students.add(new Student(109, "Harley", "555 Pine St"));
        students.add(new Student(110, "Calvin", "725 Ash St"));
        students.add(new Student(112, "Jacklyn", "980 Birch St"));
        students.add(new Student(107, "Jalen", "1223 Spruce St"));
        students.add(new Student(108, "Mindy", "1440 Elm St"));
        students.add(new Student(111, "Howard", "1532 Maple St"));
        students.add(new Student(104, "Emily", "865 Oak St"));

        // Create comparators
        NameComparator nameComparator = new NameComparator();
        RollNoComparator rollNoComparator = new RollNoComparator();

        // Print original list
        System.out.println("Original List:");
        printStudents(students);

        // Sort by name
        SelectionSort.sort(students, nameComparator);
        System.out.println("Sorted by Name:");
        printStudents(students);

        // Sort by roll number
        SelectionSort.sort(students, rollNoComparator);
        System.out.println("Sorted by Roll No:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
