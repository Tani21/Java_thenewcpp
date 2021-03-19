
class Student
{
	
		public int rollno = 12345;
		private int age= 19; 
		String name = "Tanishka";
		protected String branch = "Devops";
		
		void print()
		
		{
			System.out.println("public rollno: "+rollno);
			System.out.println("private age: "+age);
			System.out.println("default name: "+name);
			System.out.println("protected branch: "+branch);
		}

	
}

public class WithinClass {
	
	

	public static void main(String[] args) {
		Student student = new Student();
		student.print();
		
	}

}

