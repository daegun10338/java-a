//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("정수 3개를 입력하세요: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("모두 양수");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("음수 포함");
        } else {
            System.out.println("모두 0");
        }

        sc.close();
    }
}