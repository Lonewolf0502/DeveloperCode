import java.util.*;
public class Roman_to_Integer {


    public static void main(String[] args) {
        System.out.println("Enter a Roman Number");
        Scanner sc=new Scanner(System.in);
        String roman=sc.next();
        int x=RomanToInt(roman);
        System.out.println("The corresponding integer number is "+x);
        
    }


    static String p="IVXLCDM";
    public static int RomanToInt(String s){
        
        int l=s.length();
        if(l==1)
        {
            if(s.charAt(0)=='M'){return 1000;} 
            else if(s.charAt(0)=='D'){return 500;} 
            else if(s.charAt(0)=='C'){ return 100;}   
            else if(s.charAt(0)=='L') return 50;   
            else if(s.charAt(0)=='X') return 10;   
            else if(s.charAt(0)=='V') return 5;   
            else if(s.charAt(0)=='I') return 1;   
        }
        else if(l==2){
            if(p.indexOf(s.charAt(0))<p.indexOf(s.charAt(1)))
                return RomanToInt(""+s.charAt(1))-RomanToInt(""+s.charAt(0));
            else
                return RomanToInt(""+s.charAt(1)) + RomanToInt(""+s.charAt(0));   
        }
        else if(l==3 && p.indexOf(s.charAt(0))==p.indexOf(s.charAt(1)) && p.indexOf(s.charAt(1))==p.indexOf(s.charAt(2))){
            return RomanToInt(""+s.charAt(0))+RomanToInt(""+s.charAt(1)) + RomanToInt(""+s.charAt(2));
        }
        else {
            int i=0;
            while(p.indexOf(s.charAt(i))<=p.indexOf(s.charAt(i+1)) && i+1<l)
            {
                i++;
            }
            if(i+1<l)
                return RomanToInt(s.substring(0, i+1)) + RomanToInt(s.substring(i+1));
            return RomanToInt(s.substring(0));    
        }
        return 0;
    }

    
    
}
