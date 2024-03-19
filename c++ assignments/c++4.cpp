//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' with the constructor having the three sides as its parameters.

#include<iostream>
using namespace std;
class Triangle{
	private:
		int s1,s2,s3;

	public:
		Triangle(int x,int y,int z){
			s1=x;
			s2=y;
			s3=z;
}
		int area(){
			return 0.5*s1*s2;
		}
		int perimeter(){
			return s1+s2+s3;
		}
};
main(){
	Triangle t1(3,4,5);
	
	cout<<"\nArea of triangle="<<t1.area();
	cout<<"\nperimeter of triangle="<<t1.perimeter();
}
