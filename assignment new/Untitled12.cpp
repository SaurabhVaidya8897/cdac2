#include<iostream>
#include<cmath>
using namespace std;
main(){
	int principal,rate;
	int time,n;
	float CI;
	
	cout<<"Enter principal,rate,compound frequency and time";
	cin>>principal>>rate>>time>>n;
	CI=principal*pow((1+(rate/(n*100))),(n*time));
	cout<<"compound intrest is"<<CI; 
	
}
