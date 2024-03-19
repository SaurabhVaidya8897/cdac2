#include <iostream>
using namespace std;

class Volume {
private:
    int length;
    int breadth;
    int height;

public:
    
    Volume(int l,int b,int h){
    	length=l;
    	breadth=b;
    	height=h;
	}
    	

    int calculateVolume() {
        return length*breadth*height;
    }
};

main() {
    int length,breadth,height;
    cout<<"Enter length of the box: ";
    cin>>length;
    cout<<"Enter breadth of the box:";
    cin >> breadth;
    cout << "Enter height of the box: ";
    cin >> height;
    Volume box(length, breadth, height);
    cout<<"Volume of the box: "<< box.calculateVolume();

   
}

