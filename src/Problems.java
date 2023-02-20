import java.util.*;
import java.io.*;

public class Problems {
    public void print_Dhaka_Bangladesh_numbers(){
        for(int i=1; i<=500; i++){
            if(i%7 == 0 && i%13==0){
                System.out.println("Dhaka, Bangladesh");
            }
            else if (i%7==0){
                System.out.println("Dhaka");
            }
            else if(i%13==0){
                System.out.println("Bangladesh");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public void recursive(String line){
        for(int i=line.length()-1; i>=0; i--){
            System.out.print(line.charAt(i));
        }
    }
    //Validating the number plate of a car given the pattern of valid number plates
    // Ka-123-123
    //Kha-12-312
    //Ga-123-123
    //Gha-13-123

    public boolean validateNumberPlate(String number){
        int points = 0;
        String[] parts = number.split("-");
        System.out.println(parts[0]);
        String[] valid_prefix = {"ka", "Kha", "Ga", "Gha"};
        for(String s:valid_prefix)
            System.out.println(s);
        for(String s: valid_prefix){
            if(parts[0].equals(s)){
                points += 1;
                System.out.println("First Logic check" + points);
            }
        }
        if(parts[1].length() <= 3 && parts[1].length() >=2){
            points += 1;
            System.out.println("Second Logic check" + points);
        }
        if(parts[2].length() == 3){
            points += 1;
            System.out.println("Third Logic check" + points);
        }
        System.out.println(points);
        if(points == 3){
            return true;
        }
        else {
            return false;
        }
    }

    public Vector<String> splitStrings(String str, char dl){
        String word = "";
        int num = 0;
        str = str + dl;
        int l = str.length();

        Vector<String> sub_str = new Vector<String>();
        for(int i=0; i< l; i++){
            System.out.println("Current itiration: "+i);
            if(str.charAt(i)!= dl){
                System.out.println("Current Character: "+str.charAt(i));
                word = word + str.charAt(i);
                System.out.println("Character after adding it: "+word);
                System.out.println("Sub String List: "+sub_str);
            }

            else{
                if((int)word.length() != 0){
                    System.out.println("Checking word length: "+word.length());
                    sub_str.add(word);
                    System.out.println("Sub String List: "+sub_str);
                }
            word = "";
            }
        }
        return sub_str;
    }
}
