class NumberToWordExample1   
{   
static void numberToWords(char num[])  
{  

int len = num.length;  
  
if (len == 0)   
{  
 
System.out.println("The string is ?.");  
return;  
}  
if (len > 10)   
{  
System.out.println("\n The given number has more than 9 digits.");  
return;  
}    
String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
//the first index is empty because it makes indexing easy   
String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
//string type array of tens multiples   
//the first two indexes are empty because it makes indexing easy   
String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
//string type array of power of tens   
String[] poweroftens = new String[] {"Hundred", "Thousand"};  
//Used for debugging purpose only   
//the valueOf() method returns the string representation of the character array argument  
System.out.print(String.valueOf(num) + ": ");  
//checks whether the length of the given string is one or not  
if (len == 1)   
{  
//if the above condition returns true, it accesses the corresponding index and prints the value of that index  
//[num[0]-'0']: getting the number equal the decimal value of the character (assuming the char is the digit)  
System.out.println(onedigit[num[0]-'0']);  
return;  
}  
int x = 0;  
//executes until num does not become not '\0'  
while (x < num.length)   
{  
//executes if the length of the string is greater than equal to three  
if (len >= 3)   
{  
if (num[x] - '0' != 0)   
{  
System.out.print(onedigit[num[x] - '0'] + " ");  
//here length can be 3 or 4  
System.out.print(poweroftens[len - 3]+ " ");  
}  
//decrements the length of the string by 1  
--len;  
}  
//executes if the given number has two digits  
else   
{  
//the if-statement handles the numbers from 10 to 19 only     
if (num[x] - '0' == 1)   
{  
//adding the digits of the given number   
//the logic behind sum up the digits is that we will use the sum for accessing the index of the array   
//for example: 17, sum of digits = 8  
//we will access the 8th index in twodigits[] array i.e. Seventeen  
int sum = num[x] - '0' + num[x + 1] - '0';  
System.out.println(twodigits[sum]);  
return;  
}  
//the else-if statement handles the number 20 only  
//compares the tens and unit place with 2 and 0 respectively  
else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
{  
//executes if the above else-if condition returns true    
System.out.println("Twenty");  
return;  
}  
//the else block handles the numbers from 21 to 100  
else   
{  
int i = (num[x] - '0');  
if (i > 0)  
//prints the ith index element of the array multipleoftens[]  
System.out.print(multipleoftens[i]+ " ");  
else  
//prints space  
System.out.print("");  
//increments the variable i by 1  
++x;  
//checks whether the number is not equal to zero, it means the number has only a digit  
if (num[x] - '0' != 0)  
//prints the ith index element of the array onedigit[]  
System.out.println(onedigit[num[x] - '0']);  
}  
}  
//increments the variable i by 1  
++x;  
}  
}  
//main() method  
public static void main(String args[])  
{  
//calling the user-defined method and that invokes another predefined method toCharArray()  
//the method toCharArray() converts the given number into character array  
numberToWords("1111".toCharArray());  
numberToWords("673".toCharArray());  
numberToWords("85".toCharArray());  
numberToWords("5".toCharArray());  
numberToWords("0".toCharArray());  
numberToWords("20".toCharArray());  
numberToWords("1000".toCharArray());  
numberToWords("12345".toCharArray());  
//passing empty string   
numberToWords("".toCharArray());  
}  
}  
