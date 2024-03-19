#include<iostream>
using namespace std;
int main(){
	float amount,total,Discount;
	cout<<"Enter the total bill amount";
	cin>>amount;
	float amountf=amount;
	if(amount>=10000){
		Discount=10;
	//	amount=90*amount/100;
	}
	else if(amount>=5000&& amount<=9999){
		Discount=5;
	//	amount=95*amount/100;
		
	}
	else if(amount>=2000&& amount<=4999){
		Discount=2;
	//	amount=98*amount/100;
		
	}
	else{
		Discount=100;//Discount=100;
		//amountf=amountf-Discount;
	
	}

	cout<<"\nTotal amount :"<<amountf;
	cout<<"\nDiscount :"<<amountf*Discount/100;
	cout<<"\nDiscount given x% :"<<Discount;
	cout<<"\nAmount to pay :"<<amountf-amountf*Discount/100;
	
	return 0;
}
