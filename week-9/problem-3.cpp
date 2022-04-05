#include <iostream>

using namespace std;

const int N = 100;
class Stack
{
public:
    int top;
    int arr[N];
    Stack()
    {
        front = -1;
        tail = -1;
    }
    void push(int id)
    {
        if (front == -1)
        {
            front++;

            arr[front] = id;
        }

        for (int i = front; i < tail; i++)
        {
            front++;
            arr[front] = id;
        }
    }
    void pop()
    {
        for (int i = 0; i < tail; i++)
        {
        }
    }
    void display() {}
    void top() {}
};

class queue
{
public:
    int front = -1;
    int tail = -1;
    int arr[N];
    void enqueue(int id)
    {
    }
    void dequeue() {}
    void top() {}
};
int main()
{

    return 0;
}