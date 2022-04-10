import java.util.Scanner;

public class Person {
    private int id = 55400;
    private String surname = "Aliyev";
    private String first_name;
    private String street;
    private String zipCode;
    private String city;

    public void initialize(){
        Scanner in = new Scanner(System.in);
 
//        System.out.print("Enter surname: ");
//        surname = in.nextLine();

        System.out.print("Enter first name: ");
        first_name = in.nextLine();

        System.out.print("Enter street: ");
        street = in.nextLine();

        System.out.print("Enter zip code: ");
        zipCode = in.nextLine();

        System.out.print("Enter city: ");
        city = in.nextLine();

        // in.close();
    }

    public void print(){
        System.out.println("Id: " + id);
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + first_name);
        System.out.println("Street: " + street);
        System.out.println("Zip code: " + zipCode);
        System.out.println("City: " + city);
    }

}
