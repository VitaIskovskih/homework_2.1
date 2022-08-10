public class Main {
    public static void main(String[] args) {
        int price = 150;//стоимости билета
        int bonus = 20;//количество рублей для одной бонусной мили


        int miles = price / bonus;//количество бонусных миль
        System.out.println(miles + "миль");
    }
}