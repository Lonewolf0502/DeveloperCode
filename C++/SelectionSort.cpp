/*
Summary: Selection sort divides the input list into two parts: the sublist of items already sorted and the sublist of items remaining to be sorted.
It proceeds by finding the smallest (or largest) element in the unsorted sublist,
exchanging it with the leftmost unsorted element and moving the sublist boundaries one element to the right.

-------Complexity - O(n^2)----------
*/

#include<iostream>
using namespace std;

void selsort(int n, int data[])
{
	int i, j, min, temp;
	cout<<"\nSorted List is:\n";
	for(i=1;i<=n-1;i++)
	{
		min = i;
		for(j=i+1;j<=n;j++)
		{
			if(data[j]<data[min])
				min = j;
		}	
		temp=data[i];
		data[i]=data[min];
		data[min]=temp;
	}
	for(i=1;i<=n;i++)
		cout<<data[i]<<" ";
}

int main()
{
	int i, size;

	cout<<"\nEnter no of Elements:";
	cin>>size;
	int arr[size];
	cout<<"\nEnter Elements:";
	for(i=1;i<=size;i++)
		cin>>arr[i];

	cout<<"\nUnsorted data:\n";
	for(i=1;i<=size;i++)
		cout<<arr[i]<<" ";

	selsort(size, arr);
	
}

