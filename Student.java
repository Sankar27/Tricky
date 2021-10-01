package interviewQue;

public class Student {
		
		String name;
				
		Student()
		{
			
		}
		
		Student(String name)
		{	
			this.name = name;
			System.out.println(name);
		}
		
		public static void main(String[] args) 
		{
			Student s1 = new Student("Varoon");
			Student s2 = new Student("Unknown");
	    }

}
