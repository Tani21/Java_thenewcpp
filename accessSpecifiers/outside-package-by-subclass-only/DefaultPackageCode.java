import packageone.AccessSpecifiers;

class ABCD extends AccessSpecifiers
{
	void print()
	{
	System.out.println("value of rollno from accessSpecifiers: "+rollno);
	System.out.println("value of branch from accessSpecifiers: "+branch);
	}
}

public class DefaultPackageCode {

	public static void main(String[] args) {
		
		ABCD objtwo = new ABCD();
		objtwo.print();
		
		
	}

}
