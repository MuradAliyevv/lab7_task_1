import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Staff extends Person{
    private String education;
    private String position;
    
    public void initialize1(){
        initialize();
        Scanner in = new Scanner(System.in);
 
        System.out.print("Enter education: ");
        education = in.nextLine();

        System.out.print("Enter position: ");
        position = in.nextLine();

        // in.close();
    }

    public void print1(){
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    public class staff extends Person implements Salary{
        String education_Aliyev_55400;
        String position_Aliyev_55400;

        public void initialize1_Aliyev_55400() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            initialize1_Aliyev_55400();
            System.out.println("Enter your education");
            education_Aliyev_55400 = br.readLine();
            System.out.println("Enter your position");
            position_Aliyev_55400 = br.readLine();
        }

        public void print1_Aliyev_55400(){
            print1_Aliyev_55400();
            System.out.println("education:"+ education_Aliyev_55400);
            System.out.println("position:"+ position_Aliyev_55400);
        }

        @Override
        public void initialize() throws IOException {
            super.initialize();
        }

        @Override
        public double salarytoPay(double hours, double rate) {
            return 0;
        }
    }

}
