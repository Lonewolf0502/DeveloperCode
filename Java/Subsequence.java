package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class stringSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = getSubSequence(str);
        System.out.println(res);
	}

	private static ArrayList<String> getSubSequence(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		
		char ch = str.charAt(0);           // a
		String ros = str.substring(1);     //bc
		ArrayList<String> rres = getSubSequence(ros);   //[--,-c,b-,bc]
		ArrayList<String> mres = new ArrayList<>();
		for(String rstr: rres) {
			mres.add(""+rstr);
		}
		for(String rstr : rres) {
			mres.add(ch+rstr);
		}
		return mres;
	}

}
