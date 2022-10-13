/*

Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF

*/

package main

import "fmt"

func main() {
	var i, num, j int
	fmt.Println("Enter the character for alpha pattern")
	fmt.Scan(&num)
	ch := 'A'

	for i = 0; i < num; i++ {
		for j = 0; j <= i; j++ {
			fmt.Printf("%c", ch)
		}
		ch = ch + 1
		fmt.Println()
	}

}
