#include <iostream>
using namespace std;

void insectionSort(int arr[], int n)
{
    int temp;
    for (int i = 0; i <= n - 1; i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (arr[i] < arr[j])
            {
                temp=arr[i];
            }
            for (int k = 0; k > j; k--)
            {
                arr[k]=arr[k-1];
            }
            arr[j]=temp;
        }
    }
}
int main()
{
    int n;
    int arr[n];
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[n];
    }

    for (int i = 0; i < n; i++)
    {
        cout << arr[n] << " ";
    }
    return 0;
}