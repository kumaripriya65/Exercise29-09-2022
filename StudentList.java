package collectionExercise;
    import java.util.Comparator;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;

	public class StudentList{
		
		public static void main(String[] args) {
			  ArrayList<Students> students = new ArrayList<>();
			  
			  students.add(new Students("AF0216223",	"Aryan Raj",	    21, 	"Andra Pradhesh"));
			  students.add(new Students("AF0216224",	"Bivor Kumar",  	22, 	"Andra Pradhesh"));
			  students.add(new Students("AF0216227",	"SUSHMITA KUMARI",	23,     "Madhya Pradesh"));
			  students.add(new Students("AF0216231",	"Ragiv Zafar",	    24,	    "Maharashtra"));
			  students.add(new Students("AF0216232",	"RAHUL MAHTO",  	25,  	"Orissa"));
			  students.add(new Students("AF0216234",	"Nainsi Kumari",	19,     "Gujarath"));
			  students.add(new Students("AF0216236",	"MD ALI",	        26,	    "Madhya Pradesh"));
			  students.add(new Students("AF0216238",	"ABHISHEK KUMAR",	22,  	"Andra Pradhesh"));
			  students.add(new Students("AF0216240",	"AFROZ ANSARI", 	21,     "Maharashtra"));
			  students.add(new Students("AF0216259",	"RITIK RAJ",	    20, 	"Orissa"));
			  students.add(new Students("AF0216263",	"Anant Kumar",	    25,	    "Andra Pradhesh"));
			  students.add(new Students("AF0216305",	"BABU KUMAR",	    24, 	"Gujarath"));
			  students.add(new Students("AF0216307",	"NIKITA KUMARI",	23,	    "Madhya Pradesh"));
			  students.add(new Students("AF0216353",	"PRANAV PANDEY",	22,	    "Orissa"));
			  students.add(new Students("AF0216964",	"Radheshyam Kumar",	21, 	"Maharashtra"));
			  students.add(new Students("AF0216973",	"Ankur Utpal",  	19,	    "Gujarath"));
			  students.add(new Students("AF0217607",	"Banty Mishra",	    18,  	"Madhya Pradesh"));
			  students.add(new Students("AF0217615",	"RIYA KUMARI",  	20,	    "Madhya Pradesh"));
			  students.add(new Students("AF0217791",	"Priyadarshani Kumari",21,	"Maharashtra"));
			  students.add(new Students("AF0223373",	"Chanchal Thakur",	22,	    "Orissa"));
			  students.add(new Students("AF0221549",	"SATENDRA KUMAR",	23,	    "Maharashtra"));
			  students.add(new Students("AF0216212",	"Pappi Verma",	    24,     ""	));
			  students.add(new Students("AF0216244",	"Ramkrishna Kushwah",25,	"Andra Pradhesh"));
			  students.add(new Students("AF0216245",	"Yogita Tamoliya",	26,	    "Orissa"));
			  
			  //Diplay the details
			  for(Students student:students) {
					 System.out.println(student);
					 System.out.println();
				 }
			  System.out.println();
			  System.out.println("*******************************************************************");
			  System.out.println();
			  
			  //Student aged over 20
			  System.out.println("Age greater than 20..");
			  System.out.println();
			  for(Students student: students) {
				  if(student.getAge()>20) {
					  System.out.println(student);
				  }
			  }
			  System.out.println();
			  System.out.println("*******************************************************************");
			  System.out.println();
			  
			  //Students from the state Andhra Pradhesh
			  System.out.println("State is equal to Andra Pradhesh...");
			  System.out.println();
			  for(Students student: students) {
				  if(student.getState()=="Andra Pradhesh") {
					  System.out.println(student);
				  }
			  }
			  System.out.println();
			  System.out.println("*******************************************************************");
			  System.out.println();
			  
			  //sort students by their age
			  System.out.println("sorting by age...");  
			  System.out.println();
			  
				Collections.sort(students, new AgeComparator());  
				Iterator<Students> itr1=students.iterator();  
				int i = 0;
				while(itr1.hasNext()){  
					  
					System.out.println(i++ + " . " + itr1.next()); 
				} 
				System.out.println();
				System.out.println("****************************************************************");
				System.out.println();
				
				//sort students by their state and name
				System.out.println("Sorting by state and name... ");
				System.out.println();
				
				Collections.sort(students , new AgeComparator());
				Iterator<Students> itr2 = students.iterator();
				int e = 0;
				while(itr2.hasNext()) {
					System.out.println(e++ + " . " + itr2.next());
				}
				System.out.println();
				System.out.println("****************************************************************");
				System.out.println();

		}

	}
	
