public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double index = service.calculate(100, 1.70);
        System.out.printf("Ваш индекс массы тела равен %.1f",index);

    }
}
