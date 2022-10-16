#include <iostream>
using namespace std;
void tower(int n,char src, char dest, char help){
    if(n==0){
        return;
    }
    tower(n-1,src,help,dest);
    std::cout << "move from " << src << " to " << dest<< std::endl;
    tower(n-1,help,dest,src);
}
int main() {
	// tower of hanoi
	tower(3,'a','c','b');
	return 0;
}
