#include <iostream>
using namespace std;

class Student
{
private:
    int id;
    int creditCompleted;
    float cgpa;

public:
    Student(int id, int creComplete, float cgpa)
    {
        this->id = id;
        this->creditCompleted = creComplete;
        this->cgpa = cgpa;
    }
    void setID(int id)
    {
        this->id = id;
    }
    int getID()
    {
        return id;
    }
    void setCreditCompleted(int creComplete)
    {
        this->creditCompleted = creComplete;
    }
    int getCreditCompleted() {}
    void setCGPA(float cgpa)
    {
        this->cgpa = cgpa;
    }
    float getCGPA()
    {
        return this->cgpa;
    }
};
int main()
{
    int[] sss =new int[10]; 
    Student st[] = Student[10];
    return 0;
}