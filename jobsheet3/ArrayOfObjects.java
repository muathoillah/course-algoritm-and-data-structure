/**
 * ArrayOfObjects
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
    rectangle[] rectangleArray = new rectangle[3];

rectangleArray[0] = new rectangle();
rectangleArray[0].length = 110;
rectangleArray[0].width = 30;

rectangleArray[1] = new rectangle();
rectangleArray[1].length = 80;
rectangleArray[1].width = 40;

rectangleArray[2] = new rectangle();
rectangleArray[2].length = 100;
rectangleArray[2].width = 20;

System.out.println("First rectangle, width:" + rectangleArray[0].width + " Length:" + rectangleArray[0].length);
System.out.println("Second rectangle, width:" + rectangleArray[1].width + "Length:" + rectangleArray[1].length);
System.out.println("Third rectangle, width:" + rectangleArray[2].width + ", length:" + rectangleArray[2].length);

}

}