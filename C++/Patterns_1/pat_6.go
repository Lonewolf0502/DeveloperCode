/*

Code : Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK


*/

package main

import "fmt"

func main() {
	var num, i, j int
	fmt.Println("Enter the num for character pattern")
	fmt.Scan(&num)
	ch := 'A'
	ch1 := 'A'
	for i = 0; i < num; i++ {
		ch = ch1
		for j = 0; j <= i; j++ {
			fmt.Printf("%c", ch)
			ch = ch + 1
		}
		ch1 = ch1 + 1
		fmt.Println()
	}
}
