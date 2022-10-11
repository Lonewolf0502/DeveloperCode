package DynamicProgramming;

import java.util.Scanner;

public class BinaryStringWithnoCons0 {

	public static void main(String[] args) {
		// Without using arrays
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oldCountZeroes = 1;
		int oldCountOnes = 1;
		
		for(int i = 2 ;i<= n;i++) {
			int newCountZeroes = oldCountOnes;
			int newCountOnes = oldCountOnes + oldCountZeroes;
			
			oldCountZeroes = newCountZeroes;
			oldCountOnes = newCountOnes;
			
		}
		System.out.println(oldCountZeroes + oldCountOnes);

	}

}
