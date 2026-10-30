//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    int fee;

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    if (age >= 18) {
        fee = 4000;
    }
    else if (age >= 13) {
        fee = 3000;
    }
    else if (age >= 7) {
        fee = 1000;
    }
    else {
        fee = 0;
    }

    System.out.println("입장료는 " + fee + "원입니다.");
}
