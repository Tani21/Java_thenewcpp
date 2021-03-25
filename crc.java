public class crc_two {
	
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
	
	public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
	
	/*static String remainder(String a, String b)
    {
        int n = a.length();
        String consideredstring = b.substring(0, n);
        int diff = b.length() - a.length();
        for(int i=n; i<diff; i++)
        {
            consideredstring =  b.substring(0, i);
            String xor = Xor(a, consideredstring);
            System.out.println(xor);
        }
        return consideredstring;
    }*/
	
	static String Xor(String a, String consideredstring)
    {
        String xorstring="";
        int n = a.length();
        for(int i=0; i<n; i++)
        {
            if(a.charAt(i)==consideredstring.charAt(i))
            {
                xorstring = xorstring+'0';
            }
            
            else
            {
                xorstring = xorstring+ '1';
            }
        }
        return xorstring;
    }
    
	public static void main(String[] args) {
		String divisor = "101";
		int divisorlength = divisor.length();	
		String dividend = "101101";
		int dividendlength = dividend.length();
		String quotient = "";
		String finalconsiderstring = "";
		
		String appendededstring = appended(divisor, dividend); 
		
		//String remainderstring = remainder(divisor, appendededstring);
		
		int i=0;
		int p=0;
		String remainderxor="";
		String considerstring = appendededstring.substring(0, i);
		int length = considerstring.length();
		
	for(int k=0; k<dividendlength; k++)
	{
		for(int j=0; j<divisorlength-1; j++)
		{
			if(length < divisorlength)
				{
					i=i+1;
					considerstring = appendededstring.substring(0, i);
					
				}
			System.out.println("string that is considered"+considerstring);
			
			int c =considerstring.compareTo(divisor);
			
			if(c>0)
			{
				quotient=quotient+'1';
				remainderxor = Xor(divisor, considerstring);
				System.out.println("remainder after xor"+remainderxor);
			}
			
			
			
			if(c==0)
			{
				quotient=quotient+'1';
				remainderxor = Xor(divisor, considerstring);
				System.out.println("remainder after zor: "+remainderxor);
			}
			
			System.out.println("quotient: "+quotient);
			System.out.println("j: "+j);
			
			considerstring = remainderxor;
			int considerstringlength = considerstring.length();
			for(int t=0; t<considerstringlength; t++) 
			{
				if(considerstring.charAt(t)=='0')
				{
					charRemoveAt(considerstring, t);
				}
			}
			
			finalconsiderstring = considerstring;
			/*
			if(c<0)
			{
				quotient=quotient+'0';
				i=i+1;
				considerstring = appendededstring.substring(0, i);
				String remainderxor = Xor(divisor, considerstring);
				System.out.println(remainderxor);
			}*/
			
			
			
			
		}
	}
		
		
		
		

	}

}
