/*

Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.

Pattern for N = 5


The dots represent spaces.

Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *


*/

package main

import "fmt"

func main() {
	var num, i, j, space, odd_cnt int
	fmt.Println("Enter the num for which Diamond Pattern u want")
	fmt.Scan(&num)

	odd_cnt = 1
	space = num / 2
	for i = 0; i <= num/2; i++ {
		for j = space; j > 0; j-- {
			fmt.Print(" ")
		}
		for j = 0; j < odd_cnt; j++ {
			fmt.Print("*")
		}

		odd_cnt = odd_cnt + 2
		space = space - 1
		fmt.Println()

	}

	space = 1
	odd_cnt = odd_cnt - 4
	for i = (num / 2) + 1; i < num; i++ {
		for j = 0; j < space; j++ {
			fmt.Print(" ")
		}
		for j = 0; j < odd_cnt; j++ {
			fmt.Print("*")
		}
		odd_cnt = odd_cnt - 2
		space = space + 1
		fmt.Println()
	}

}
