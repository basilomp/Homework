package test_package.macgrat.practice;

public class Constants {
    public static void main(String[] args) {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
        int td;
        int pat;
        int fg;
        td = 4 * TOUCHDOWN;
        pat = 3 * CONVERSION;
        fg = 2 * FIELDGOAL;
        int total = (td + pat + fg);
        System.out.println("Всего очков: " + total);
    }
}
