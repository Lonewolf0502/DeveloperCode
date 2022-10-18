/*
Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
comparing each pair of adjacent items and swapping them if they are in the wrong order.

-----Complexity - O(n^2)-------
*/

#include <iostream>
using namespace std;

int main()
{
	int i, j, num, temp;

	cout<<"Enter the value of num \n";
	cin>>num;
	int arr[num];
	printf("Enter the elements one by one \n");
	for (i = 0; i < num; i++)
	{
		cin>>arr[i];
	}

   /*   Bubble sorting begins */
	for (i = 0; i < num; i++)
	{
		for (j = 0; j < (num - i - 1); j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	
	cout<<"Sorted array is...\n";
	for (i = 0; i < num; i++)
	{
		cout<<arr[i]<<" ";
	}
return 0;
}

