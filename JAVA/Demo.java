

public class Demo {
    public static void main(String a[]){
        AdvCalc calculator = new AdvCalc();

        int r1 = calculator.add(2, 4);
        int r2 = calculator.sub(4, 1);
        int r3 = calculator.mul(4, 4);
        double r4 = calculator.div(4, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }
}
