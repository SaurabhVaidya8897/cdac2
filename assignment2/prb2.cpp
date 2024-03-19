//2 accept a number from user only if number is perfectly div by 5 and 3 else till
// it is not given keep taking number.
#include<iostream>
using namespace std;
main(){
	int n,flag;
	do
	{
		cout<<"Enter number";
		cin>>n;
		if(n%3==0 && n%5==0){
			flag=0;
			cout<<"Divisble by 5 and 3";
		}
		else
			flag=1;
	}while(flag!=0);
	
	
}
