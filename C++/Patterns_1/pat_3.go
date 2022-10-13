/*

Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
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
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666

*/

package main

import "fmt"

func main() {
	var num, i, j int
	fmt.Println("Enter the num for triangle number pattern")
	fmt.Scan(&num)
	temp := 1
	for i = 0; i < num; i++ {
		for j = 0; j <= i; j++ {
			fmt.Printf("%d", temp)
		}
		temp = temp + 1
		fmt.Println()
	}
}
