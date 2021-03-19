package accessspecifiers;
//import accessspecifiers.FileTwo;

public class FileOne {

	public static void main(String[] args) {
		FileTwo obj = new FileTwo();
		System.out.println("public rollno: "+obj.rollno);
		System.out.println("default name: "+obj.name);
		System.out.println("protected branch: "+obj.branch);

	}

}

