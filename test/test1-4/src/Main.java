//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

    Scanner keyboard = new Scanner(System.in);

    int score;

    System.out.print("점수를 입력하세요: ");
    score = keyboard.nextInt();

    if ((score >= 80 && score < 90) || score == 1000) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}
