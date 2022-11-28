import java.util.*;

public class lab2_ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("As an admin, enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        int int_password = Integer.valueOf(password);
        int flag=0; int decrypted_password=0; String decrypt_password="";

        System.out.println("Applying brute force technique, we get: ");
        for(int i=1000; i<=9999; i++){
            if(i==int_password){
                decrypted_password=i;
                flag=1;
                break;
            }

            else{
                for(int j=0; j<=9; j++){
                    String formattedStr = String.format("%04d",j);
                    if(formattedStr.equals(password)){
                        decrypt_password=formattedStr;
                        flag=2;
                        break;
                    }
                }
            } 
        }

        if(flag==1){
            System.out.println("Password found!");
            System.out.println("Password for username: "+username+" is: "+decrypted_password);
        }

        else if(flag ==2){
            System.out.println("Password found!");
            System.out.println("Password for username: "+username+" is: "+decrypt_password);
        }

        else{
            System.out.println("Oops, password did not match");
        }
        sc.close();
    }
}
