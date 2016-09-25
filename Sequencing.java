import java.util.Scanner;

public class Sequencing{
    public static void main( String[] args ){
        //THIS CODE IS BROKEN UNTIL YOU FIX IT
        
        Scanner keyboard=new Scanner(System.in);
        double price,salesTax,total;
        
        System.out.print("How much is the purchase price?");
        price=keyboard.nextDouble();
        
        salesTax=price*0.0825;
        total=price+salesTax;
        
        System.out.println("Item price:\t"+price);
        System.out.println("Sales tax:\t"+salesTax);
        System.out.println("Total cost:\t"+total);
    }
}

//When removing the zero I get this error message: "salesTax=price*0.0825;".

//The program works as expected. My result after inputing "7.99" was: 8.649175.

//After removing the "0" the program still compiled correctly. 