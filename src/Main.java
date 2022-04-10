public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println();
        System.out.println("-- Initialize Person --");
        person.initialize();

        System.out.println();
        System.out.println("-- Print Person --");
        person.print();

        Staff staff = new Staff();

        System.out.println();
        System.out.println("-- Initialize Staff --");
        staff.initialize1();

        System.out.println();
        System.out.println("-- Print Staff --");
        staff.print1();
    }
}
