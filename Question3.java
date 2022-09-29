package collectionExercise;
import java.util.*;
public class Question3 {
	public static void minToFront(ArrayList<Integer>list)
	{
		int miniIndex=0;
		for(int j=1; j<list.size(); j++)
		{
			if(list.get(miniIndex)>list.get(j))
				miniIndex=j;
		}
		int min=list.get(miniIndex);
		list.remove(miniIndex);
		list.add(0,min);
	}
		
	public static void main(String[] args)
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(92);
		list.add(4);
		list.add(2);
		list.add(17);
		list.add(9);
		System.out.println("Before performing operation\n");
		System.out.print(list);
		
		minToFront(list);
		System.out.println("\nAfter performing operation\n");
		System.out.print(list);
	}
}
