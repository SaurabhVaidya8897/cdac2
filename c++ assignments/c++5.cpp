//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
//creating a class named 'Rectangle' with a function named 'Area' which returns the area. Length and
//breadth are passed as parameters to its constructor.
#include<iostream>
using namespace std;
class Rectangle{
	private:
		int len,breadth;

	public:
		Rectangle(int x,int y){
			len=x;
			breadth=y;
		}
		int area(){
			return len*breadth;
		}
};
main(){
	Rectangle r1(4,5);
	Rectangle r2(5,8);
	cout<<"\nArea of rectangle 1="<<r1.area();
	cout<<"\nArea of rectangle 2="<<r2.area();
}
