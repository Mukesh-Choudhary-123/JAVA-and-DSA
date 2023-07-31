public class constructor {

    public static void main(String[] args) {
        student s = new student();
        school c = new school("DAYA");
        System.out.println(c.school_name);

        student s2 = new student(s);
    }
}

class student {

    student(student s) {// copy constructor
        System.out.println("student 2 constructor called...");
    }

    student() {// default constructor
        System.out.println("student constructor called...");
    }

    String name;
    int age;
}

class school {

    String school_name;
    int phone_number;

    school(String name) {// parameter constructor
        this.school_name = name;
        System.out.println("school coonstructor called...");
    }
}
/*
 * 
 * OUTPUT:=
 * 
 * student constructor called...
 * school coonstructor called...
 * DAYA
 * student 2 constructor called...
 */