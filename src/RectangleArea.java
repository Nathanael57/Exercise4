

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class RectangleArea {
    double a,b, area;

    void getData() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("With the program you'll calculate the area of a Rectangle");
        System.out.println("Enter the length of the side a: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the side a: ");
        b = Double.parseDouble(br.readLine());
    }

    void computeField(){area = a * b;}

    void fieldDisplay(){
        System.out.print("The area of the Rectangle with the side a = ");
        System.out.printf("%2.2f", a);
        System.out.printf(" and side b = ");
        System.out.printf("%2.2f", b);
        System.out.printf(" is = ");
        System.out.printf("%2.2f.\n", area);
    }
}

class RectangleDemo{
    public static void main(String[] args) throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();

    }
}