//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price;
        boolean member;

        System.out.print("구매 금액을 입력하세요: ");
        price = sc.nextInt();

        System.out.print("멤버십 회원인가요? (true/false): ");
        member = sc.nextBoolean();

        if (price < 0) {
            System.out.println("오류: 구매 금액이 음수입니다.");
        } else if (price >= 50000 || (member && price >= 30000)) {
            System.out.println("무료배송 가능");
        } else {
            System.out.println("무료배송 불가능");
        }

        sc.close();
    }
}
