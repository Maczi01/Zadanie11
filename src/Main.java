public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        Calc calc = new Calc();
        InputOutput io = new InputOutput();
        System.out.println(calc.whichPart(io.loadPoints()));
    }
}
