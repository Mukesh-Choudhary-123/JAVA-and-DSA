import java.util.Scanner;

public class GettersAndSetters {
    public static void main(String[] args) {
        car c = new car();
        c.setcarname();
        c.getcarname();
        c.setcar_model_number();
    }
}

class car {

    Scanner sc = new Scanner(System.in);

    String car_name;
    int car_model_number;

    void setcarname() {
        System.out.print("Enter name of car : ");
        car_name = sc.nextLine();
    }

    void getcarname() {
        System.out.println(this.car_name);
    }

    void setcar_model_number() {
        System.out.print("Enter model number of car : ");
        car_model_number = sc.nextInt();
        System.out.println(car_model_number);
    }

}
/*
 * OUTPUT:=
 * 
 * Enter name of car : maruti
 * maruti
 * Enter model number of car : 800
 * 800
 */