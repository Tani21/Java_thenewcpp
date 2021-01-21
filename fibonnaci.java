public class Main
{
	public static void main(String[] args) {
	    int a=0, b=1, newnumber;
	    System.out.println(a);
	    System.out.println(b);
		for(int i=0; i<8; i++)
		{
		    newnumber=a+b;
		    System.out.println(newnumber);
		    a=b;
		    b=newnumber;
		    
		}
	}
}
