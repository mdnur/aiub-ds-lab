#include <iostream>
using namespace std;
/**
 * @brief
 * pre order
 * post order
 * in order
 */
class Node
{
public:
    int data;
    Node *left;
    Node *right;
};
class Bst
{
public:
    Node *root;
    Bst()
    {
        root = NULL;
    }
    void create(int element)
    {
        if (root == NULL)
        {
            root = new Node();
            root->data = element;
            root->right = root->left = NULL;
            return;
        }
        Node *temp, *r;
        temp = new Node();
        temp->data = element;
        temp->left = temp->right = NULL;
        r = root;
        while (r != NULL)
        {
            if (element < r->data)
            {
                if (r->left == NULL)
                {
                    r->left = temp;
                    break;
                }
                else
                {
                    r = r->left;
                }
            }
            else if (element > r->data)
            {
                if (r->right == NULL)
                {
                    if (r->right == NULL)
                    {
                        r->right = temp;
                        break;
                    }
                    else
                    {
                        r = r->right;
                    }
                }
            }
        }
    }
    void insertALl(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            create(arr[i]);
            cout << arr[i];
        }
    }
    
};
int main()
{
    Bst b;
    cout << "hellow";
    int arr[] = {35, 37, 49, 65, 80, 60, 40, 30, 25, 27};
    // int N = sizeof(arr) / sizeof(arr[0]);
    // cout << arr[0];
    b.insertALl(arr, 10);
    return 0;
}