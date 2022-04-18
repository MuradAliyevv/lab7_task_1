import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    interface Salary{
        double salarytoPay(double hours, double rate);

        default double salaryForOvertime(double overtimeHours, double rate){
            return 1;
        }

        static int bonus(int yearsofExperience){
            if (yearsofExperience>5){
                return 100;
            } else{
                return 0;
            }
        }
    }

    public class Person{
        String surname;
        String name;
        String street;
        String zipCode;
        String city;

        public void initialize()throws IOException{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Data about a person");
            System.out.println("Enter your surname: Aliyev");
            try {
                surname= br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter your name: ");
            try {
                name = br.readLine();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the street: ");
            street = br.readLine();
            System.out.println("Enter your zip code: ");
            zipCode= br.readLine();
            System.out.println("Enter the city: ");
            city = br.readLine();

        }

        public void print(){
            System.out.println("Displaying the data:");
            System.out.println("  ");
            System.out.println("Surname: "+ surname);
            System.out.println("Name: "+ name);
            System.out.println("Street: "+street);
            System.out.println("Zip-Code: "+zipCode);
            System.out.println("City: "+ city);
        }
    }
    static class Staff extends Person implements Salary {
        String education;
        String position;


        public void initialize1() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your education: ");
            education = br.readLine();
            System.out.println("Enter your position: ");
            position = br.readLine();
        }

        public void print1() {
            print();
            System.out.println("Education: " + education);
            System.out.println("Position: " + position);
        }

        @Override
        public double salarytoPay(double hours, double rate) {
            return hours * rate;
        }


    }
    class HR{
        public static void main(String[]args) throws IOException{
            Staff employee=new Staff();


            double hours;
            double salary= employee.salarytoPay();


        }
    }


}
