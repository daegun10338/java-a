//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    int salary;
    boolean debt;

    System.out.print("나이 입력: ");
    age = keyboard.nextInt();

    System.out.print("연봉 입력(만원): ");
    salary = keyboard.nextInt();

    System.out.print("빚이 있습니까? (true/false): ");
    debt = keyboard.nextBoolean();

    if (age >= 25 && age < 40 && salary >= 5000 && debt == true) {
        System.out.println("조건 만족: true");
    } else {
        System.out.println("조건 불만족: false");
    }
}
