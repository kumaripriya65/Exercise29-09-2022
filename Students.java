package collectionExercise;

public class Students implements Comparable<Students> {

		 private String studentcode;
		 private String studentname;
		 private int age;
		 private String state;
		 
		 public Students() { // default constructor
			 
		 	}
		 
		// parameterized constructor
		 public Students(String studentcode, String studentname,int age, String state) {
			 this.studentcode= studentcode;
			 this.studentname=studentname;
			 this.age=age;
			 this.state=state;
		 	}


		 public String getStudentCode() {
			 return studentcode;
		 	}
		 
		 public void setStudentCode(String studentcode) {
			 this.studentcode=studentcode;
		 	}
		 
		 public String getStudentName() {
			 return studentname;
		 	}
		 
		 public void setStudentName(String studentname) {
			 this.studentname=studentname;
		 	}
		 
		 public  String getState() {
			 return state;
		 	}
		 
		 public void setState(String state) {
			 this.state=state;
		 	}
		 
		 public int getAge() {
			 return age;
		 	}
		 
		 public void setAge(int age) {
			 this.age=age;
		 	} 

		 public int compareTo(Students student) 
			{
				if(age==student.age) {
					return 0;
				}
				else if (age>student.age) {
					return 1;
				}
				else {
					return -1;
				}
			}
		 
		 //toString()method
		 @Override
		 public String toString() {
			 return "Student:[Code=" + studentcode + ", Name=" +
		              studentname + ", Age=" + age + ", State="+ state + "]";
		 	}

	}


