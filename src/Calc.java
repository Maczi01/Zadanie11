public class Calc {

    String whichPart(Point point){
        String text1 = "Punkt lezy w ";
        String text2 = " cwiartce ukladu wspolrzednych";

        if (point.getPointX() >= 0 && point.getPointY() >= 0) {
            return text1 + "I"+text2;
        }
        if (point.getPointX() < 0 && point.getPointY() >= 0) {
            return text1 + "II"+text2;
        }
        if (point.getPointX() < 0 && point.getPointY() < 0) {
            return text1 + "III"+text2;
        } else
            return text1 + "IV"+text2;
    }
}
