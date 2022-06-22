public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 57.1;
        double height = 1.65;
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела - " + bmi);
    }
}
