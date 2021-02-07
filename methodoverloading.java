class Display
{
    int i,j;
    double m,t,r;
    String string;
    
    void assign (int a, int b)
    {
        i = a;
        j = b;
        System.out.println("i: "+i+"  "+"j: "+j);
    }
    
    void assign (double a, double b)                   //different data types
    {
        m = a;
        t = b;
        System.out.println("m: "+m+"  "+"t: "+t);
    }
    
    void assign (double a, double b, double c)         //different number of parameters
    {
        m=a;
        t=b;
        r=c;
        System.out.println("m: "+m+"  "+"t: "+t+"  "+"r: "+r);
    }
    
    void assign(double a, String s)                   //different sequence of parameters
    {
        string = s;
        m=a;
        System.out.println("double then string");
        System.out.println("s: "+string+"  "+"m: "+m);
    }
    
    void assign(String s, double a)
    {
        string = s;
        m=a;
        System.out.println("string then double");
        System.out.println("m: "+m+"  "+"s: "+string);
    }
    
    
  
}

public class Main
{
  public static void main (String[]args)
  {
      Display object = new Display();
      object.assign(2,4);
      object.assign(2.4,4.2);
      object.assign(1.1,2.2,3.3);
      object.assign(1.1,"string");
      object.assign("string",2.2);
    
  }
}
