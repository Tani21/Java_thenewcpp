import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String finalstring="";
        int check=0;
        String ampm = s.substring(8);
        String pm="PM";
        String am="AM";
        //System.out.println(ampm);
        String hour = s.substring(0,2);
        int hours = Integer.parseInt(hour);
        //System.out.println(hours);
            String middle = s.substring(3,8);
            
        if(ampm.equals(pm))
        {
            //int hours = Integer.parseInt(hour);
            //System.out.println("are we here?");
            if(hours>=1 && hours<12)
            {
                hours=hours+12;
                //System.out.println(hours);
            }
            
            else
            {
                
            }
        }
        
        String hoursvalue = "";
        
        if(ampm.equals(am))
        {
            //int hours = Integer.parseInt(hour);
            if(hours>=1 && hours<=9)
            {
                check=check+1;
                String changevalue = String.valueOf(hours);
                hoursvalue = '0'+changevalue;
            }
            if(hours==12)
            {
                check=check+1;
                hours=hours-12;
                String changevalue = String.valueOf(hours);
                hoursvalue = '0'+changevalue;
            }
            
            
            
        }
        
        if(check==1)
        {
            finalstring=hoursvalue+":"+middle;   
        }
        
        else
        {
            finalstring = hours+":"+middle;
        }
        return finalstring;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

