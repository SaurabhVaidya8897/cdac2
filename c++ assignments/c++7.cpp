//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
//its length and breadth as parameters of its constructor and having a function named 'returnArea'
//which returns the area of the rectangle. Length and breadth of the rectangle are entered through
//keyboard.

#include <iostream>
using namespace std;

class Area{
private:
    int length;
    int breadth;

public:
    Area(int len, int bre) {
        length = len;
        breadth = bre;
    }

    int returnArea() {
        return length * breadth;
    }
};

main() {
    int len,bre;
    cout<<"Enter length of the rectangle: ";
    cin>>len;
    cout<<"Enter breadth of the rectangle: ";
    cin>>bre;


    Area rectangle(len, bre);
    cout<< "Area of the rectangle: "<<rectangle.returnArea();

    
}

