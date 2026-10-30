//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    double time;
    int day, hour, minute, second;

    System.out.print("시간 입력: ");
    time = keyboard.nextDouble();

    day = (int)(time / 24);
    hour = (int)(time % 24);

    minute = (int)((time * 60) % 60);
    second = (int)((time * 3600) % 60);

    System.out.println(time + " 시간은 " + day + " 일 "
            + hour + " 시간 " + minute + " 분 "
            + second + " 초 입니다.");
}
