import java.lang.*;
import java.util.*;
/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */
    
    
    public static void main(String args[]) 
    {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
        //test(result);
    }
    
    public static void test(String res){
    	
    	String Ref = "Rental Record for joe\n\tTitle\t\tDays\tAmount\n\tmovie1\t\t10\t30.0\n\tmovie2\t\t5\t4.5\nAmount owed is 34.5\nYou earned 3 frequent renter points";
    	System.out.println("\n"+res);
    	System.out.println("\n"+Ref);
    	if (res == Ref){System.out.println("\nOK");}
    	else {System.out.println("\nFehler!");}
    	    	
    }
}


