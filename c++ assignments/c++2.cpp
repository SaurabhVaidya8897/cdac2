//Assign and print the roll number, phone number and address of two students having names "Sam"
//and "John" respectively by creating two objects of the class 'Student'.

#include<iostream>
#include<string.h>
using namespace std;
class Student{
	private:
		int rollno,phno;
		char name[50];
	public:
		Student(int x ,int p ,char s[])
		{
			rollno=x;
			phno=p;
			strcpy(name,s);
			
		}
		void show()
		{
			cout<<"\nRollno:"<<rollno<<"\nPhno:"<<phno<<"\nName:"<<name;
		}
};
main(){
	//Student s1,s2;
	Student s1(23,87990334,"sam");
	Student s2(24,89550434,"john");
	s1.show();
	s2.show();
}
