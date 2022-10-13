/*


Code : Triangular Star Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****

Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******


*/
package main

import "fmt"

func main() {
	var num, i, j int
	fmt.Println("Enter the num for which triangle star pattern print")
	fmt.Scan(&num)
	for i = 0; i < num; i++ {
		for j = 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}

}
