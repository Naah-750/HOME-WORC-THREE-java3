import java.util.Scanner;

public class Q_one {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] X = new int[9];
        System.out.println("int elements:  ");
        for (int i = 0; i < X.length; i++)
        {
            X[i] = in.nextInt();
        }
        int []y = new int[8];
        System.arraycopy(X, 0, y, 0, y.length);
        System.out.println("clon array: ");
        for (int j : y) {
            System.out.println(j);
        }
    }
}
