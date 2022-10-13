/*

Code : Reverse Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321

*/

package main

import "fmt"

func main() {
	var i, j, num int
	fmt.Println("Enter the num for reverse pattern")
	fmt.Scan(&num)
	temp := 1
	for i = 0; i < num; i++ {
		for j = temp; j >= 1; j-- {
			fmt.Printf("%d", j)
		}
		temp = temp + 1
		fmt.Println()
	}
}
