//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

    public class Main {
        public static void main(String[] args) {
            char ch = 'A';
            int year = 2024;
            boolean powerOn = false;
            String str01 = "yes";

            System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
            System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
            System.out.println(!powerOn);
            System.out.println(str01.equals("yes"));
        }
    }

