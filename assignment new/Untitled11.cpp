#include<iostream>
#include<cmath>
using namespace std;
main(){
	int principal,rate;
	int time;
	float SI;
	
	cout<<"Enter principal,rate and time";
	cin>>principal>>rate>>time;
	SI=principal*rate*time/100;
	cout<<"Simple intrest is"<<SI; 
	
}