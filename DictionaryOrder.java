import java.util.Scanner;

public class DictionaryOrder{
    public static void main( String[] arg ){
        Scanner keyboard=new Scanner(System.in);
        String name ;
        
        System.out.print("Make up the name of a programming language!");
        name=keyboard.nextLine();
        
        if(name.compareTo("c++")<0)
            System.out.println(name+"comes BEFORE c++");
        if(name.comapreTo("c++")==0)
            System.out.println("c++ isn't a made-up language!");
        if(name.comapreTo("c++")>0)
            System.out.println("comes AFTER c++");
        
        if(name.comapreTo("go")<0)
            System.out.println(name+"comes BEFORE go");
        if(name.comapreTo("go")==0)
            System.out.println("go isn't a made-up language!");
        if(name.comapreTo("go")>0)
            System.out.println(name+"comes AFTER go");
            
        if(name.comapreTo("java")<0)
            System.out.println(name+"comes BEFORE java");
        if(name.comapreTo("java")==0)
            System.out.println("java isn't a made-up language!");
        if(name.comapreTo("java")>0)
            System.out.println(name+"comes AFTER java");
            
        if(name.comapreTo("lisp")<0)
            System.out.println(name+"comes BEFORE lisp");
        if(name.comapreTo("lisp")==0)
            System.out.println("lisp isn't a made-up language!");
        if(name.comapreTo("lisp")>0)
            System.out.println(name+"comes AFTER lisp");
            
        if(name.comapreTo("python")<0)
            System.out.println(name+"comes BEFORE python");
        if(name.comapreTo("python")==0)
            System.out.println("python isn't a made-up language!");
        if(name.comapreTo("python")>0)
            System.out.println(name+"comes AFTER python");
            
        if(name.comapreTo("ruby")<0)
            System.out.println(name+"comes BEFORE ruby");
        if(name.comapreTo("ruby")==0)
            System.out.println("ruby isn't a made-up language!");
        if(name.comapreTo("ruby")>0)
            System.out.println(name+"comes AFTER ruby");
            
        if(name.comapreTo("visualbasic")<0)
            System.out.println(name+"comes BEFORE visualbasic");
        if(name.comapreTo("visualbasic")==0)
            System.out.println("visualbasic isn't a made-up language!");
        if(name.comapreTo("visualbasic")>0)
            System.out.println(name+"comes AFTER visualbasic");
        }
}
