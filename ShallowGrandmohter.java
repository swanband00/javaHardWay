import java.util.Scanner;

    public class ShallowGrandmother{
        public static main void( String[] args ){
        Scanner keyboard=new Scanner(System.in);
        int age;
        double income, cute;
        boolean allowed;
    
        System.out.print("Enter your age:");
        age=keyboard.nextInt();
    
        System.out.print("Enter your yearly income:");
        cute=keyboard.nextDouble();
    
        allowed=(age> 25 && age<40 && (income > 50000 || cute >=8.5));
    
        System.out.println("Allowed to date my grnadchild?"+allowed);
    }
}
