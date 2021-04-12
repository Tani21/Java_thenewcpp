import java.lang.*;

class Main
{
    public static void main(String[] args)
    {
        StringBuffer paragraph = new StringBuffer("This paragrapgh will contain multiple lines. some lines will not start with a capital letter. Some lines will start with a capital letter. we have to capitalise all starting letters"); 
        System.out.println("ORIGINAL STRING: "+paragraph);
        
        for (int i = 0; i < paragraph.length(); i++) 
        {
            if(paragraph.charAt(i)=='.')
            {
               paragraph.setCharAt(i+2, Character.toUpperCase(paragraph.charAt(i+2)));   
            }
        }
         System.out.println();
        System.out.println("CHANGED STRING: "+paragraph);
    }
}
