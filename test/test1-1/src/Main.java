//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int attend;
    int report;
    int cheating;

    System.out.print("출석률 입력: ");
    attend = keyboard.nextInt();

    System.out.print("과제 제출률 입력: ");
    report = keyboard.nextInt();

    System.out.print("부정행위 기록 (없음: 0, 있음: 1): ");
    cheating = keyboard.nextInt();

    if (attend >= 80 && report >= 70 && cheating == 0) {
        System.out.println("온라인 시험 응시 가능");
    } else {
        System.out.println("온라인 시험 응시 불가능");
    }

}


