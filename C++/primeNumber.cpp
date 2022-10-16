#include <iostream>

using namespace std;

//function to check no is prime or not
bool isprime(int n)
{   
    if(n==1)
    {
        return false; //since 1 is not prime number
    }
    for(int i=2;i<n/2; i++) // we are traversing upto n/2 only because a number can't be divisible by no greater than its half.
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true; 
}

int main()
{
    int n;
    cin>>n; //taking input from user
    if(isprime(n)==true)
    {
        std::cout << n <<" is prime number" << std::endl;
    }
    else
    {
        std::cout << n <<" is not prime number" << std::endl;
    }

    return 0;
}
