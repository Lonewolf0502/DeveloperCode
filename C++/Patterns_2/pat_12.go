/*

Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4


The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654

*/

package main

import "fmt"

func main() {
	var num, space, i, odd_cnt, res, temp, j int
	fmt.Println("Enter the value of num for which triangle of numbers pattern wanted")
	fmt.Scan(&num)

	res = 1
	odd_cnt = 1
	space = num
	for i = 0; i < num; i++ {
		for j = space; j > 0; j-- {
			fmt.Print(" ")
		}
		temp = res
		for j = 0; j < odd_cnt/2; j++ {
			//fmt.Print(1)
			fmt.Print(temp)
			temp = temp + 1

		}
		//temp = temp - 1
		for j = odd_cnt / 2; j < odd_cnt; j++ {
			//fmt.Print(1)
			fmt.Print(temp)
			temp = temp - 1

		}

		odd_cnt = odd_cnt + 2
		space = space - 1
		res = res + 1
		fmt.Println()
	}
}
