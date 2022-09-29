package collectionExercise;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
	
		
		
		@Override
		public int compare(Students o1, Students o2) { //comparison of objects 
			Students student1 = (Students)o1;
			Students student2 = (Students)o2;
			
			if(student1.getAge() == student2.getAge()) {
				return 0;
			}
			else if(student1.getAge() > student2.getAge()) {
				return 1;
			}
			else 
				return -1;
		}
	}


