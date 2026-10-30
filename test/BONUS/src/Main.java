//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    double buy = 1015000;
    double profit = 0.3;
    double tax = 0.1;

    double price;
    double salesTax;
    double buyTax;
    double result;

    price = buy * (1 + profit);

    salesTax = price * tax;

    buyTax = buy * tax;

    result = salesTax - buyTax;

    System.out.println("매입원가: " + buy + "원");
    System.out.println("판매 정가: " + price + "원");
    System.out.println("매출세액: " + salesTax + "원");
    System.out.println("매입세액: " + buyTax + "원");
    System.out.println("납부세액: " + result + "원");
}
