public class Main
{
    
    public static String addCharToString(String str, char c, int pos) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(pos, c);
        return stringBuilder.toString();
    }
    
	public static void main(String[] args) {
		String start = "01111110";
		String end = start;
		String data, stream;
		char ch='0';
		int i=0;
		int position=i; 
		String appended="";
		
		
		System.out.println("Enter the data in bits in command line arguments ");
		data = args[0];
		stream=start+data+end;
		System.out.println("startFlag: "+start+" endFlag: "+end);
		System.out.println();
		System.out.println("stream: "+stream);
		
		int flag=0;
		for(i=0; i<data.length(); i++)
		{
		    
		    if(data.charAt(i)=='1')
		    {
		        flag=flag+1;
		       
		        if(flag%5==0 )
		        {
                   data = addCharToString(data,ch,i+1);
		        }
		        
		        else {}
		    }
		    
		    else{}
		}
		System.out.println("appended string: "+data);
		System.out.println("string after bit stuffing: "+start+data+end);
	}
}
