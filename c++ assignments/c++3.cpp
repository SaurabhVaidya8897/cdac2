//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' with a function to print the area and perimeter.
#include<iostream>
using namespace std;
class Triangle{
	private:
		int a,b,c,per;
		float area;
	public:
		void get(int x,int y,int z){
			a=x;
			b=y;
			c=z;
			per=x+y+z;
			area=0.5*y*z;	
		}
		void show(){
			cout<<"\nArea="<<area<<"\nPerimeter"<<per;
		}
};
main(){
	Triangle t1;
	t1.get(3,4,5);
	t1.show();
}
