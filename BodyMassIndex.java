public class BodyMassIndex {
    public double calculate(double height, double weight) {
        double massindex = weight / (Math.pow(height, 2));
        return massindex;
    }
}
