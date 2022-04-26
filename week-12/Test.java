import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] name = new int[10];
        for (int i = 0; i < 10; i++) {
            name[i] =input.nextInt();            
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        input.close();
    }
}
