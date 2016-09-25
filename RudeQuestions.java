import java.util.Scanner;

public class RudeQuestions{
	public static void main(String[] args){
		String name;
		int age;
		double weight, income, height;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Hello, What is your name?" );
		name=keyboard.next();
		
		System.out.print("Hi, "+ name +"! How old are you?");
		age=keyboard.nextInt();
		
		System.out.print("So you're "+age+", eh? That's not very old.");
		System.out.print("How much do you weigh, "+name+"?");
		weight=keyboard.nextDouble();
		
		System.out.print(weight+"! Better keep that quiet!!");
		System.out.print("Finally, what's your income,"+name+"?");
		income=keyboard.nextDouble();
		
		System.out.print("One More question if you don't mind? How tall are you,"+height+"?");
		height=keyboard.nextDouble();
		
		System.out.print("Hopefully that is "+income+" per hour");
		System.out.print("and not per year!");
		System.out.print("Well, thanks for answering my rude questions");
		System.out.print(name+".");
	}
}

//Yes, the program blows up if I type 179lbs into the 3rd question. 

//No, the 1st question did not blow up when I entered "63" instead of a name.

//I'm not doing that.