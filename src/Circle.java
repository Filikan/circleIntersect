import java.util.Scanner;

public class Circle {
    public static double x1,x2;
    public static double y1,y2;
    public static double R1,R2;
    public static double distance;
    public static double abstractDistance;

    public static boolean DoesIntersect(Circle c1,Circle c2){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x1:");
        x1=sc.nextDouble();
        System.out.println("Please enter y1:");
        y1=sc.nextDouble();
        System.out.println("Please enter R1:");
        R1=sc.nextDouble();

        System.out.println("Please enter x2:");
        x2=sc.nextDouble();
        System.out.println("Please enter y2:");
        y2=sc.nextDouble();
        System.out.println("Please enter R2:");
        R2=sc.nextDouble();

        distance =Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

        if(R1+R2<distance)
        {
            System.out.println("There is no intersection");
            return false;
        }
        abstractDistance=Math.abs(R1-R2);
        if(abstractDistance>distance)
        {
            System.out.println("There is no intersection");
            return false;
        }
        if(distance==0 && abstractDistance==0)
        {
            System.out.println("They intersect infinite number of locations in any other cases this two circle intersect in one or two location");
            return true;
        }
        return false;
    }

}
