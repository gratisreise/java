package week1;
import java.util.*;

public class Main06 {
    public static void mnain(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                if(c + 13 > 'Z'){
                    c = (char)(c - 13);
                } else {
                    c = (char)(c + 13);
                }
            } else if(Character.isLowerCase(c)){
                if(c + 13 > 'z'){
                    c = (char)(c - 13);
                } else {
                    c = (char)(c + 13);
                }
            }
            ret.append(c);
        }
        System.out.println(ret);
    }
}
