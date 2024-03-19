//Write a program that would print the information (name, year of joining, salary, address) of three
//employees by creating a class named 'Employee'. The output should be as follows:
//Name Year of joining Address
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat

#include <iostream>
#include <string.h>
using namespace std;

class Employee {
private:
    char name[50];
    int yearOfJoining;
    int salary;
    char address[50];

public:
   
    Employee(char n[],int year, char addr[]){

		strcpy(name,n);
	    yearOfJoining=year;
        strcpy(address,addr);
       
    }

    void show(){
        cout<<"\nname "<<name<<"\nYearof joining "<<yearOfJoining<<"\nSalary "<<salary<<"\nAdress "<<address;
    }
};


main(){
	Employee e1("Robert",1994,"Wallsstreet");
	Employee e2("Sam" ,2000 ,"68D-WallsStreat");
	Employee e3("John ",1999 ,"26B-WallsStreat");
	cout <<"Name,Year of Joining,Salary andAddress";
	e1.show();
	e2.show();
	e3.show();
}
