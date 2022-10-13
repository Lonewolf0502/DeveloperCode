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
	var num, i, j, odd_star, space int
	fmt.Println("Enter the num to print Diamond of Stars pattern")
	fmt.Scan(&num)

	odd_star = 1
	space = num / 2
	for i = 0; i < num/2; i++ {
		// (num/2) times printing upper start and then printing the lower start
		//printing space first
		for j = space; j > 0; j-- {
			fmt.Print(" ")
		}
		space = space - 1
		for j = 1; j <= odd_star; j++ {
			fmt.Print("*")
		}
		odd_star = odd_star + 1
		fmt.Println()
	}

	odd_star = odd_star - 2
	space = 1
	for j = num / 2; j < num; j++ {
		// now printing the lower one part
		for i = 1; i <= space; i++ {
			fmt.Print(" ")
		}
		space = space + 1
		for j = 1; j <= odd_star; j++ {
			fmt.Print("*")
		}
		fmt.Println()

	}
}
