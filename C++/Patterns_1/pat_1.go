/*
Code : Square Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666
*/
package main

import "fmt"

func main() {
	var num, i, j int
	fmt.Println("Enter the Integer N for pattern")
	fmt.Scan(&num)
	for i = 0; i < num; i++ {
		for j = 0; j < num; j++ {
			fmt.Printf("%d", num)
		}
		fmt.Println()
	}
}
