import java.io.*;

public class Weird_Algorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(n).append(" ");
            if (n == 1) break;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print(sb.toString().trim());
    }
}
