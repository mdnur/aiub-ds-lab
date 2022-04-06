#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
};
class List
{
    Node *start;
    Node *end;

public:
    List()
    {
        start = NULL;
        end = NULL;
    }
    void create_end(int el)
    {
        Node *current;
        if (start == NULL)
        {
            start = new Node();
            start->data = el;
            start->next = NULL;
            end = start;
        }
        else
        {
            current = new Node();
            current->data = el;
            current->next = NULL;
            end->next = current;
            end = current;
        }
    }
    void display(){
        if (start == NULL)
        {
            cout << "NO element found" << endl;
            return ;
        }
        
        Node *current = start;
        while (current !=NULL)
        {
            cout << current->data << "->";
            current = current->next;
        }
        cout << "NUll";   
    }
};

int main()
{
    List *list = new List();
    list->create_end(120);
    list->create_end(20);
    list->create_end(30);
    list->display();

    // List b;
    // b.create_end(22);
    // b.display();
    return 0;
}