public class Main {
    
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50;
        double height = 1.6;
        int imt = (int) service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела = " + imt);
    }
}
