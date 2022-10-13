/*

Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG


*/
package main

import "fmt"

func main() {
	var num, i, j int
	fmt.Println("Enter the num for which interesting alphabet patter ")
	fmt.Scan(&num)
	var char, res byte
	ch := 'A' + num
	char = byte(ch)
	for i = 0; i < num; i++ {
		res = char
		for j = 0; j < i; j++ {
			fmt.Printf("%c", res)
			res = res + 1
		}
		fmt.Println()
		char = char - 1
	}
}
