public class Main
{
    static String appended(String a, String b)
    {
        int n = a.length();
        String appendedstring=b;
        for(int i=0; i<n-1; i++)
        {
            appendedstring=appendedstring+'0';
        }
        return appendedstring;
    }
    
    
	public static void main(String[] args) {
		String divisor = "1001";
		String dividend = "10111011";
		
		String appendededstring = appended(divisor, dividend); 
		System.out.println(appendededstring);
		
		
	}
}
