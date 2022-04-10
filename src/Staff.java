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

}
