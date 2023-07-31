public class ObjectClass {
    public static void main(String[] args) {

        student stud = new student();// object

        stud.setname("Mukesh Choudhary");
        System.out.println("Name is : " + stud.fullname);

        stud.age = 20;
        System.out.println("Age is : " + stud.age);
    }
}

class student {// class

    String fullname;
    int age;

    void setname(String name) {
        fullname = name;
    }

}
/*
 * OUTPUT:=
 * 
 * Name is : Mukesh Choudhary
 * Age is : 20
 * 
 */