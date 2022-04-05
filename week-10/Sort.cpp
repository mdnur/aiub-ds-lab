#include <iostream>
using namespace std;

void sort(int array[], int size)
{
    int temp, j;

    for (int i = 1; i < size; i++)
    {
        temp = array[i];
        for (int j = 1; j < i; j++)
        {
            int temp2 = array[j];
            if (array[i] < array[j])
            {
                for (int k = 1; k > j; k--)
                {
                    array[k] = array[k - 1];
                }
            }
        }
    }
}

int main()
{
    int size;
    cout << "How many number you wanted to add: ";
    cin >> size;

    int array[size];
    for (int i = 0; i < size; i++)
    {
        cin >> array[i];
    }
    sort(array,size);
    for (int i = 0; i < size; i++)
    {
        cout<< array[i];
    }
   return 0;
}