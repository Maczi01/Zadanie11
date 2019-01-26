import java.util.Scanner;

public class InputOutput {

    Scanner scanner = new Scanner(System.in);

    Point loadPoints() {
        Point p = new Point();
        int x = 0;
        int y;
        System.out.println("Podaj punkt X");
        x = scanner.nextInt();

        System.out.println("Podaj punkt Y");
        y = scanner.nextInt();
        p.setPointX(x);
        p.setPointY(y);
        return new Point(x,y);
    }
}
