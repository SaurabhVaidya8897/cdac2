//Write a program to print the area of a rectangle by creating a class named 'Area' having two
//functions. First function named as 'setDim' takes the length and breadth of the rectangle as
//parameters and the second function named as 'getArea' returns the area of the rectangle. Length and
//breadth of the rectangle are entered through keyboard.

#include<iostream>
using namespace std;
class Area{
	private:
		int len,breadth;

	public:
		setDim(int x,int y){
			len=x;
			breadth=y;
		}
		getArea(){
			return len*breadth;
		}
};
main(){
	Area rectangle;
	int x,y;
	cout<<"Enter the length and breadth";
	cin>>x>>y;
	
	rectangle.setDim(x,y);
	cout<<"\nArea of rectangle"<<rectangle.getArea();
}
