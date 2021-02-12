class RecuriveCalling
{
    int fact(int a)
    {
        int factorial=1;
        if(a==0 || a==1)
            return 1;
        else
            factorial=a*fact(a-1);
            
        return factorial;    
       
    }

}

public class Main
{
	public static void main(String[] args) {
		RecuriveCalling object = new RecuriveCalling();
		int ans=object.fact(Integer.parseInt(args[0]));
		System.out.println("fact of "+Integer.parseInt(args[0])+" is: "+ans);
	}
}
