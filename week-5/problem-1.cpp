#include <iostream>
using namespace std;
#define size 1000
class MyStack
{
    int stack[size];
    int top;

public:
    MyStack()
    {
        top = -1;
    }
    int push(int value)
    {
        if (top == (size - 1))
        {
            cout << "Overflow ,more elements can not be inserted " << endl;
            return -1;
        }
        top++;
        stack[top] = value;
        return stack[top];
    }
    int pop()
    {
        if (top < 0)
        {
            cout << "Underflow " << endl;
            return -1;
        }
        return stack[top--];
    }
    void display()
    {
        if (top < 0)
        {
            cout << "Stack is Empty";
        }
        else
        {
            for (int i = top; i >= 0; i--)
            {
                int x = stack[i];
                cout << x << endl;
            }
        }
    }
    void countElement() {}
    int isEmpty()
    {
        if (top < 0)
        {
            cout << "Stack is Empty" << endl;
            return -1;
        }
        else
        {
            return true;
        }
    }
};
int main()
{
    MyStack s = MyStack();
    cout << s.push(10) << " push" << endl;
    cout << s.push(20) << " push" << endl;
    cout << s.push(30) << " push" << endl;
    cout << s.pop() << " pop" << endl;
    cout << s.pop() << " pop" << endl;
    cout << s.push(50) << " push" << endl;
    cout << s.push(70) << " push" << endl;
    s.display();

    return 0;
}