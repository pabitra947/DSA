import java.util.*;

public class Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 1;
        int maxLen = 1;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else count = 1;
        }

        System.out.println(maxLen);
    }
}
