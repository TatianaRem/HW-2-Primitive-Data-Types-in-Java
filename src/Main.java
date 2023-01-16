public class Main {
    public static void main(String[] args) {
        int price = 10_000; //cтоимость билета//
        int rublesBonus = 20; //количество рублей за 1 бонусную милю//

        System.out.println("Количество полученных миль");
        System.out.println(price / rublesBonus);
    }
}