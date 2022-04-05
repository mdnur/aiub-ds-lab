#include <iostream>
using namespace std;
int bubbleSeach(int x, int size, int array[])
{
    int first = 0;
    int last = size - 1;
    int mid = (first + last) / 2;
    while (first <= last)
    {
        if (x == array[mid])
        {
            return mid;
        }
        else if (x >= array[mid])
        {
            first = mid++;
        }
        else
        {
            last = mid--;
        }
    }
    return -1;
}
int main()
{
    int size;
    cout << "How many number you wanted add: ";
    cin >> size;

    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    int search;
    cout << "You wanted to search: ";
    cin >> search;
    int result = bubbleSeach(search, size, arr);
    if (result == -1)
    {
        cout << "Not found";
    }
    else
    {
        cout << result << endl;
    }

    return 0;
}