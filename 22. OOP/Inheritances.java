public class Inheritances {
    public static void main(String[] args) {
        a a1 = new a();
        b b1 = new b(); // single inheritances
        b2 b3 = new b2(); // hierarchial inheritances
        c c1 = new c(); // multi-leve inheritances
        d d1 = new d(); // hybrid inheritances

        c1.name = "Mukesh Choudhary";
        d1.father_name = "My Father";
        d1.mother_name = "My Mother";
        b1.age = 20;
        b1.addres = "India";
        c1.hobbies = "Coding";

        System.out.println(c1.name);
        System.out.println(d1.father_name);
        System.out.println(d1.mother_name);
        System.out.println(b1.age);
        System.out.println(b1.addres);
        System.out.println(c1.hobbies);

    }
}

class a {

    String name;
    int age;

}

class b extends a { // single inheritances

    String addres;
    int phone_number;

}

class b2 extends a { // hierarchial inheritances

    String mother_name;
}

class c extends b { // multi-leve inheritances

    String hobbies;

}

class d extends b2 { // hybrid inheritances

    String father_name;
}
/*
 * OUTPUT:=
 * 
 * Mukesh Choudhary
 * My Father
 * My Mother
 * 20
 * India
 * Coding
 * 
 */