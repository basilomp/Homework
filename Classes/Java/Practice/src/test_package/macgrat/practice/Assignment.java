package test_package.macgrat.practice;

public class Assignment {
    public static void main(String[] args) {
        String txt = "Fantastic";
        String lang = "Java";
        txt += lang;
        System.out.println(txt);

        int sum = 10;
        int num = 20;
        sum += num;
        System.out.print("Складываем и присваиваем: " + sum + "\n");

        int factor = 5;
        sum *= factor;
        System.out.println("Результат: " + sum);

        sum /= factor;
        System.out.println("Результат деления: " + sum);
    }
}
