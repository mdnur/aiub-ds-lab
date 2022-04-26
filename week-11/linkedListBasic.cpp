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
    void display()
    {
        if (start == NULL)
        {
            cout << "NO element found" << endl;
            return;
        }

        Node *current = start;
        while (current != NULL)
        {
            cout << current->data << "->";
            current = current->next;
        }
        cout << "NUll";
    }

    void PreOrder(Node *root1)
    {
        if (root == NULL)
        {
            return;
        }
        cout << root->data << " ";
        PreOrder(root->left);
        PreOrder(root->right);
    }
    void postOrder(Node *root1)
    {
    }
    void inOrder(Node *root1)
    {
    }
    bool Search(Node *root, int data)
    {
        if (root == NULL)
        {
            cout << "Error: tree is empty" << endl;
            return false;
        }
        else if (root->data == data)
        {
            return true;
        }
        else if (data <= root->data)
        {
            return Search(root->left, data);
        }
        else
        {
            return Search(root->right, data);
        }
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