#include <iostream>
using namespace std;
#define size 8
class Stack
{
    int stack[size];
    int top;

public:
    Stack()
    {
        top = -1;
    }
    int push(int element)
    {
        if (top == (size - 1))
        {
            cout << "Overflow ,more elements can not be inserted " << endl;
            return 0;
        }
        stack[++top] = element;
        return element;
    }
    int pop()
    {
        if (top < 0)
        {
            cout << "Underflow, no elements are there " << endl;
            return 0;
        }
        return stack[top--];
    }
    void display()
    {
       
    }
    void countElement() {}
    int isEmpty()
    {
        return 0;
    }
};
int main()
{
    Stack stk = Stack();
     stk.push(4);
     stk.push(5);
     stk.push(6);
     stk.push(7);
     stk.pop();
     stk.pop();

    return 0;
}