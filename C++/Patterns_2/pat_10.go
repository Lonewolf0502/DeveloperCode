/*

Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4


The dots represent spaces.

Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  ***
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   ***
  *****
 *******

*/

package main

import "fmt"

func main() {
	var i, num, odd_star, k, space int
	fmt.Println("Enter the num to print the STAR pattern")
	fmt.Scan(&num)

	odd_star = 1
	space = num
	for i = 0; i < num; i++ {
		//first printing space and then stars
		for k = 1; k < space; k++ {
			fmt.Print(" ")
		}

		for k = 1; k <= odd_star; k++ {
			fmt.Print("*")
		}
		space = space - 1
		odd_star = odd_star + 2
		fmt.Println()

	}
}
