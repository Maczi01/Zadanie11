import java.util.Scanner;

public class InputOutput {

    Scanner scanner = new Scanner(System.in);
    Point p = new Point();
    Calc calc = new Calc();
    
    Point loadPoints() {
        int x = 0;
        int y;
        System.out.println("Podaj punkt X");
        x = scanner.nextInt();
        System.out.println("Podaj punkt Y");
        y = scanner.nextInt();
        p.setPointX(x);
        p.setPointY(y);
        showInfo(calc);
        return new Point(x,y);
    }

    void showInfo(Calc calc){
        if (calc.whichPart(p)==1){
            System.out.println("1 ćwiartka");
        }
        if (calc.whichPart(p)==2){
            System.out.println("2 ćwiartka");
        }
        if (calc.whichPart(p)==3){
            System.out.println("3 ćwiartka");
        }
        if (calc.whichPart(p)==4){
            System.out.println("4 ćwiartka");
        }
    }
}
