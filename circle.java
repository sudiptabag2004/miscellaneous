import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        double radiuses = j.nextDouble();
        double perimeter;
        double area;


        if(radiuses<=0){
            System.out.print("give positive value");
        }
        else{
            perimeter = 2*Math.PI*radiuses;
            area = Math.PI*radiuses*radiuses;
            System.out.println(perimeter);
            System.out.println(area);
        }
    }
    
}
