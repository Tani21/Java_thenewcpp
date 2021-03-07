public class MyCLass
{
    
    public static String charRemoveAt(String str, int p) 
    {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  
    
	public static void main(String[] args) {
		System.out.println("Code for bit destuffing");
		System.out.println("Please enter string with flags using command line arguments");
		
	    String s1=args[0];  
	    System.out.println("string entered: "+s1);
        String startFlag = s1.substring(0,8); 
        String endFlag = s1.substring((s1.length()-8),s1.length());    
        String data = s1.substring(8,(s1.length()-8) );
        
        int flag=0;
        
        for(int i=0; i<data.length(); i++)
        {
            if(data.charAt(i)=='1')
            {
                flag=flag+1;
                
                if(flag%5==0)
                {
                    if(data.charAt(i+1)=='0')
                    {
                         data=charRemoveAt(data, i+1);  
                         
                    }
                }
            }
        }
        
        System.out.println("Original string after destuffing: "+startFlag+data+endFlag);
	}
}
                   
                 
