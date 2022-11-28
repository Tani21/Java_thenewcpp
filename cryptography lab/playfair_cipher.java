import java.util.*;

public class playfair_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        System.out.println("Enter key: ");
        String key=sc.next();
        Map<Character, Character> hm = new LinkedHashMap<Character, Character>();
        String keycopy = "", output="";
        int counter=0;

        char twodarray[][] = new char[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int k=97;
                if(!key.isEmpty()){
                    twodarray[i][j] = key.charAt(counter);
                    keycopy = keycopy+key.charAt(counter);
                    key = key.replace(String.valueOf(key.charAt(counter)), "");
                }

                else{
                        char insertingchar = (char)k;
                        if(insertingchar=='j'){
                            k++;
                            break;
                        }

                        else{
                            while(keycopy.contains(String.valueOf(insertingchar))){
                                k++;
                                insertingchar = (char)k;

                                if(insertingchar=='j'){
                                    k++;
                                insertingchar = (char)k;
                                } 
                            }
                            twodarray[i][j] = (char)k;
                            keycopy=keycopy+(char)k;
                    }
                }
            }
        }

            for(int i=0; i<input.length(); i=i+2){
                hm.put(input.charAt(i), input.charAt(i+1));
            }

            for (Map.Entry<Character, Character> e : hm.entrySet()) 
            {
                char charone = e.getKey();
                char chartwo = e.getValue();
                int charonex=0, charoney=0, chartwox=0, chartwoy=0;

                for(int i=0; i<5; i++){
                    for(int j=0; j<5; j++){
                        if(twodarray[i][j]==charone){
                            charonex=i;
                            charoney=j;
                        }

                        else if(twodarray[i][j]==chartwo){
                            chartwox=i;
                            chartwoy=j;
                        }
                    }
                }

                if(charoney==chartwoy){
                    output = output + twodarray[(charonex+1)%5][charoney];
                    output = output + twodarray[(chartwox+1)%5][charoney];
                }

                else if(charonex==chartwox){
                    output = output + twodarray[charonex][(charoney+1)%5];
                    output = output + twodarray[charonex][(charoney+1)%5];
                }

                else{
                    output = output + twodarray[charonex][chartwoy];
                    output = output + twodarray[chartwox][charoney];
                }

            }
        
            System.out.println("ciphered text: "+output);
            sc.close();
    }
    
}
