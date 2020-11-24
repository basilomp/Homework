package test_package.macgrat.practice;

public class Precedence {
    public static void main(String[] args) {
    int sum = 32 - 8 + 16 * 2; //16 * 2 = 32 + 24 = 56
        System.out.println("Порядок действий по умолчанию: " + sum);

    sum = (32 - 8 + 16) * 2;
        System.out.println("Указанный порядок действий: " + sum);

    sum = (32 - (8 + 16)) * 2;
    System.out.println("Специфический порядок действий: " + sum);
    }
}
