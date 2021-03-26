class AvailableBooks
{
	String checkbook="";
	
	AvailableBooks(String checkbook, String books[])
	{
		for(int i=0; i<books.length; i++)
		{
			int count=0;
			if(checkbook==books[i])
			{
				count=count+1;
			}
			
			if(count==1)
			{
				System.out.println("book is available");
			}
			
			else
				System.out.println("book is not available");
		}
		
		
	}
	
}

public class ExceptionsLab
{
	public static void main(String[] args) {
		String books_list[] = new String [10];
		try                           // nested try catch block
		{
		    try
		    {
		    	books_list[10]="Complete_Reference";
		    }
		    
		    catch(ArrayIndexOutOfBoundsException ex)
		    {
		        System.out.println(ex);
		    }
		    int c = Integer.parseInt(books_list[0]);
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		
		catch(Exception e)                    // multiple catch blocks
		{
		    System.out.println(e);
		}
		
		finally
		{
			System.out.println("you can use the complete refernce book for java");
			System.out.println("this is an example of unchecked exceptions");
			System.out.println();
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		try 
        {
            Class.forName("BooksAvailable");
        }
        catch (ClassNotFoundException ex)
        {
        	System.out.println(ex);
        }
		finally
		{
			System.out.println("this is an example of checked exceptions");
		}
		
		
	}
}
