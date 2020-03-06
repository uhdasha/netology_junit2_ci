package ru.netology.unit;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        {
            System.out.println("It should return 0 for 1000");
            int result = service.remain(1000);
            System.out.println(0 == result);
        }
        {
            System.out.println("It should return 100 for 900");
            int result = service.remain(900);
            System.out.println(100 == result);
        }
    }
}