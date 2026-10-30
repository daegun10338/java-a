//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;
    String result;
    final int MIN = 2000000;
    final int MAX = 30000000;

    System.out.print("당신의 급여 입력 : ");
    salary = keyboard.nextInt();

    if (salary >= 0 && salary <= 30000000) {

        if (salary <= 2000000) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (int) ((salary - 2000000) * (10.0f / 100));
        } else if (salary <= 6000000) {
            tax = (int) ((salary - 2000000) * (8.0f / 100));
        } else if (salary <= 20000000) {
            tax = (int) ((salary - 2000000) * (6.0f / 100));
        } else {
            tax = (int) ((salary - 2000000) * (5.0f / 100));
        }

        System.out.printf("급여액이 %,d 원이면 %,d 원의 세금을 납부하세요.\n", salary, tax);

    } else {
        result = "ERROR :급여액은 0 ~ 30,000,000 원";
        System.out.println(result);
    }
}
