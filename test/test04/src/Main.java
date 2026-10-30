//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int a, b, c;
    int max;
    double s, area;

    System.out.print("a 입력: ");
    a = keyboard.nextInt();

    System.out.print("b 입력: ");
    b = keyboard.nextInt();

    System.out.print("c 입력: ");
    c = keyboard.nextInt();

    if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {

        System.out.println("삼각형 성립");

        if (a == b && b == c) {
            System.out.println("정삼각형");
        }
        else if ((long)a * a + (long)b * b == (long)c * c ||
                (long)a * a + (long)c * c == (long)b * b ||
                (long)b * b + (long)c * c == (long)a * a) {
            System.out.println("직각삼각형");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("이등변삼각형");
        }
        else {
            System.out.println("일반삼각형");
        }

        s = (a + b + c) / 2.0;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("삼각형의 넓이: " + area);

    }
    else {
        System.out.println("삼각형이 아닙니다.");
    }
}
