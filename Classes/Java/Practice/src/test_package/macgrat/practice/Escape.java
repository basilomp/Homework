package test_package.macgrat.practice;

public class Escape {
    public static void main(String[] args) {
        String header = "\n\tНью-йорк прогноз на 3 дня:\n";
            header += "\n\tДень\t\tМакс\tМин\tОсадки\n";
            header += "\t----\t\t----\t---\t----------\n";
        String forecast = "\tВоскресенье\t68F\t\t48f\tЯсно\n";
            forecast += "\tПонедельник\t69F\t\t57f\tЯсно\n";
            forecast += "\tВторник\t\t71F\t\t51f\tОблачно\n";
        System.out.println(header + forecast);


    }
}
