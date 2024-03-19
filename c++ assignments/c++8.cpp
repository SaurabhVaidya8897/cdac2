#include <iostream>
using namespace std;

class Average {
public:
    	static void Avg(int num1,int num2,int num3) {
        int average = (num1+num2+num3)/3;
        cout<<"Average of the three numbers: "<<average;
    }
};

main() {
    int num1, num2, num3;
    cout<<"Enter three numbers:";
    cin>>num1>>num2>>num3;
    Average::Avg(num1,num2,num3);

  
}

