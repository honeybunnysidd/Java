
public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Siddhartha", 24);
        s1.marks[0] = 10;
        s1.marks[1] = 42;

        System.out.println("S1 Name: " + s1.name);
        System.out.println(s1.marks[1]);

        Student s2 = new Student(s1);
        System.out.println("S2 Name: " + s2.name);
        // System.out.println(s2.marks[1]);

        //Changing s1 marks
        s1.marks[1] = 97;

        System.out.println(s1.marks[1]); // This marks also changes due to reference of marks
        System.out.println(s2.marks[1]); // This marks also changes due to reference of marks
    }
}

class Student {

    String name;
    int age;
    int marks[];

    //--------------Shallow Copy Constructor
    /*Student(Student s1) {
        this.marks = s1.marks;
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }
     */
    //----------------Deep Copy Constructor
    Student(Student s1) {
        this.marks = new int[s1.marks.length];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = new int[2];
        System.out.println("New Object Created - Constructor is called");
    }
}
