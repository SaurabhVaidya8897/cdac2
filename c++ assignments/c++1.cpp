//Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign
//the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.


#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string name;
    int roll_no;

public:
  
    Student(string n, int roll) {
        name=n;
        roll_no=roll;
    }
    string getName() {
        return name;
    }

    int getRollNo() {
        return roll_no;
    }
};

main() {
    Student student("John", 2);

    cout << "Student Name: "<<student.getName();
    cout << "\nStudent Roll No: "<<student.getRollNo();

}


