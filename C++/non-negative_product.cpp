//The product of all the elements of the array to be a non-negative integer. That is, it can be either 00 or positive.It cannot to be negative.
//To do this,we are willing to remove some elements of the array. Determine the minimum number of elements that she we will have to remove to make the product of the array's elements non-negative.
//It is for 'T' no. of cases.
#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int c=0;
	    int z=0;
	    int x;
	    for(int i=0;i<n;i++)
	    {
	        cin>>x;
	        if(x<0)
	        c++;
	        if(x==0)
	        z=1;
	    }
	    if(z==1 || (c%2)==0)
	    cout<<0<<endl;
	    else
	    cout<<1<<endl;	    
	}
	return 0;
}
