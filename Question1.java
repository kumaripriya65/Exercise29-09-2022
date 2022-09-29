package collectionExercise;

import java.util.LinkedList;
import java.util.*;

public class Question1 {
	public static void main(String args[])
		{
			
			LinkedList<String> Languages = new LinkedList<String>();
			
			Languages.add("C");
			Languages.add("C++");
			Languages.add("Java");
			Languages.add("Kotlin");
			Languages.add("Python");
			Languages.add("Perl");
			Languages.add("Ruby");
		
			System.out.println("Complete List is");
			System.out.println(Languages);
			
			System.out.println("\nAfter removing index 5 List is");
			Languages.remove(5);
			System.out.println(Languages);
			
			System.out.println("\nAfter removing kotlin, List is");
			Languages.remove("Kotlin");
			System.out.println(Languages);
			
			System.out.println("\nAfter removing scripting languages like Python Perl and Ruby");
			Languages.subList(3,5).clear();

}
}
