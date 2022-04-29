package com.bridgelabz;
import java.util.Scanner;

public class Line {
    int x1,x2,x3,x4,y1,y2,y3,y4;
    int line1,line2;
    public void getData()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the X and Y co-ordinates for first point of line 1 : ");
        x1=scanner.nextInt();
        y1=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 1 :");
        x2=scanner.nextInt();
        y2=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for first point of line 2 : ");
        x3=scanner.nextInt();
        y3=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 2 : ");
        x4=scanner.nextInt();
        y4=scanner.nextInt();
    }
    public void compareTo()
    {
        line1=(int) Math.sqrt(((x2-x1)^2)*((x2-x1)^2)+((y2-y1)^2)*((y2-y1)^2));
        System.out.println("the distance of line 1 is "+line1);
        line2=(int) Math.sqrt(((x4-x3)^2*((x4-x3)^2)+((y4-y3)^2)*((y4-y3)^2)));
        System.out.println("the distance of line 2 is "+line2);

        if (line1==line2)
            System.out.println("the line 1 and line 2 both are equal");
        else if(line1>line2)
            System.out.println("the line 1 is greater than line 2");
        else
            System.out.println("the line 1 is less than line 2");
    }

}
