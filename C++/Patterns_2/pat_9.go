/*

Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555
4444
333
22
1


*/

package main

import "fmt"

func main() {
	var num, temp, i, j int
	fmt.Println("Enter the number to print the Inverted Number Pattern")
	fmt.Scan(&num)

	temp = num
	for i = 0; i < num; i++ {
		for j = 1; j <= temp; j++ {
			fmt.Printf("%d", temp)
		}
		temp = temp - 1
		fmt.Println()
	}
}
