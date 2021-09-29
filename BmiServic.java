public class BmiServic {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double height = 1.65;
        double weight = 63;
        double massIndex = service.calculate(height, weight);
        System.out.println("Ваш рост:" + height + " м");
        System.out.println("Ваш вес:" + weight + " кг");
        System.out.println("Ваш индекс массы тела:" + massIndex);
    }
}
