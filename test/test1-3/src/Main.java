//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    int license;
    boolean drunk;

    System.out.print("나이 입력: ");
    age = keyboard.nextInt();

    System.out.print("운전면허 취득 후 경과 기간(년): ");
    license = keyboard.nextInt();

    System.out.print("음주운전 전력이 있습니까? (true/false): ");
    drunk = keyboard.nextBoolean();

    if (age >= 21 && license >= 1 && drunk == false) {
        System.out.println("차량 렌트 가능");
    } else {
        System.out.println("차량 렌트 불가능");
    }
}
