import java.util.Scanner;

public class BMICalcualtor{
    public static void main( String[] args){
        Scanner keyboard=new Scanner(System.in);
        double bmi;
        
        System.out.print("Enter your BMI:");
        bmi=keyboard.nextDouble();
        
        System.out.print("BMI category:");
        is(bmi<15.0){
            System.out.println("very severely underweight");
        }
        else if (bmi<=16.0){
            System.out.println("severely underwegiht");
        }
        else if (bmi<18.5){
            System.out.println("normal weight");
        }
        else if (bmi<35.0){
            System.out.println("moderately obese");
        }
        else if(bmi<40.){
            System.out.println("severely obese");
        }
        else{
            System.out.println("very severely/\"morbidly\"obese");
        }
    }
}