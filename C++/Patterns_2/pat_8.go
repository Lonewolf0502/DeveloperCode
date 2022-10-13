/*

Code : Mirror Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4


The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1
    12
  123
Sample Input 2:
4
Sample Output 2:
      1
    12
  123
1234

*/

package main

import "fmt"

func main() {
	var num, space, temp, i, j, k int
	fmt.Println("Enter the number for mirror number pattern")
	fmt.Scan(&num)
	space = num
	for i = 0; i < num; i++ {
		temp = 1
		//need logic for printing space first and then the numbers
		for j = 1; j < space; j++ {
			fmt.Print(" ")
		}
		for k = 0; k <= i; k++ {
			fmt.Printf("%d", temp)
			temp = temp + 1
		}
		fmt.Println()
		space = space - 1
	}

}
