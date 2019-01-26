public class Calc {

    int whichPart(Point point){

        if (point.getPointX() >= 0 && point.getPointY() >= 0) {
            return 1;
        }
        if (point.getPointX() < 0 && point.getPointY() >= 0) {
            return 2;
        }
        if (point.getPointX() < 0 && point.getPointY() < 0) {
            return 3;
        } else
            return 4;
    }
}
