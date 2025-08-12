import java.util.*;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;

        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        long original = ((long) n * (n + 1)) / 2;

        System.out.println(original - sum);

    }
}
