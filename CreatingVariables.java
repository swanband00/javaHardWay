public class CreatingVariables{
	public static void main(String[] args){
		int x, y, age, count;
		double seconds, e, checking, pie;
		String firstName, lastName, title, book, author;
		
		x=10;
		y=400;
		age=39;
		count=16;
		
		seconds=4.71;
		e=2.7828182845904523536;
		checking=1.89;
		pie=3.14;
		
		firstName="Graham";
		lastName="Mitchell";
		title="Mr.";
		book="A Scanner Darkly";
		author="Philip K. Dick";
		
		System.out.println("The variable x contains "+x);
		System.out.println("The value "+ y +" is stored in the variable y.");
		System.out.println("The experiment took "+seconds+" seconds.");
		System.out.println("The favorite irrational # is Euler's number:"+e);
		System.out.println("Hopefully you have more than $"+firstName+lastName);
		System.out.println("My name's "+title+""+firstName+lastName);
		System.out.println("The variable count"+count);
		System.out.println("The value "+pie+" pie.");
		System.out.println("Another String\t"+book+author);
		
	}
}