//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int second;
        int hour;
        int minute;
        int remain;

        System.out.print("초를 입력하세요: ");
        second = sc.nextInt();

        hour = second / 3600;
        remain = second % 3600;
        minute = remain / 60;
        remain = remain % 60;

        System.out.println(second + " 초 = " + hour + " 시간 " + minute + " 분 " + remain + " 초");

        sc.close();
    }
}
