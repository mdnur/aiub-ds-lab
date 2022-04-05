import java.util.Scanner;

class Stack {
    public static int MAX = 100;
    int top;
    int a[] = new int[100];

    Stack() {
        top = -1;
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    public boolean isEmpty() {
        return (top < 0);
    }

}
class Queue{
    int arr[]= new int[100];
    public int front;
    public int rear;
    Queue()
    {
        front = -1;
        rear = -1;
    }

    boolean isFull()
    {
        if (front == 0 && rear == arr.length - 1)
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
    {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int value)
    {
        if (isFull())
        {
            System.out.print("Queue is overflow");
        }
        else
        {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = value;
        }
    }
    int deQueue()
    {
        int value;
        if (isEmpty())
        {
           System.out.println("Queue is empty!!"); ;
            return (-1);
        }
        else
        {
            value = arr[front];
            if (front >= rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front++;
            }
            return (value);
        }
    }

   
    int getfront()
    {
        return arr[front];
    }
}
public class Problem3 {
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print( "How many guest Id you want to enter:");
            n = sc.nextInt();
            int arr[n];
            for (int i = 0; i < n; i++)
            {
                cin >> arr[i];
            }
        
            Queue q1;
            Stack s1;
            Queue q2;
            Stack s2;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] % 2 != 0)
                {
                    q1.enQueue(arr[i]);
                    s1.push(arr[i]);
                }
                else
                {
                    s2.push(arr[i]);
                    q2.enQueue(arr[i]);
                }
            }
            cout << "Food sequence => ";
            while (!q1.isEmpty())
            {
                cout << q1.getfront() << " ";
                q1.deQueue();
            }
            while (!s2.isEmpty())
            {
                cout << s2.pop() << " ";
            }
            cout << endl;
            cout << "Leave sequence => ";
            while (!q2.isEmpty())
            {
                cout << q2.deQueue() << " ";
            }
            while (!s1.isEmpty())
            {
                cout << s1.pop() << " ";
            }
        }
}
