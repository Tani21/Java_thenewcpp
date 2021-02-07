class Book
{
    int noofpages;
    String booktype, title, author;
    double reviewoutoffive;
    
    void matchreview(Book b)
    {
        if(reviewoutoffive==b.reviewoutoffive)
            System.out.println("Books have the same review");
        else
            System.out.println("Please compare by some other method");
    }
    
    void assign(int a, double b, String s)
    {
        noofpages=a;
        reviewoutoffive=b;
        title=s;
    }
    
    
}

public class Main
{
    public static void main (String[] args)
        {
            System.out.println("Passing object as parameter");
            System.out.println();
            
            Book object1 = new Book();
            Book object2 = new Book();
            object1.assign(450,4.5,"percy_jackson");
            object2.assign(500,4.5,"harry_potter");
            
            object1.matchreview(object2);
      
        }
}
