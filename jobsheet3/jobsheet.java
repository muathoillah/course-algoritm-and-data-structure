import java.util.Scanner;
public class jobsheet {
    public static void main(String[] args) {
    rectangle[] rectangleArray = new rectangle[3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
    rectangleArray[i] = new rectangle();
    System.out.println("Rectangle" + i);
    System.out.print("Input length : ");
    rectangleArray[i].length = sc.nextInt();
    System.out.print("Input width : ");
    rectangleArray[i].width = sc.nextInt();
    }
    for (int i= 0; i<10 ; i++) {
        System.out.println("Rectangle" + i);
        System.out.println("width:" + rectangleArray[0].width + ", length:" + rectangleArray[0].length);
        }
        sc.close();
}

}
