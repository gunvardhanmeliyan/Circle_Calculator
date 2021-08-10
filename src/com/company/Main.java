package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius of Circle: ");
	double radius= sc.nextDouble();
	if(radius<=0){
	    System.out.println("Please enter non zero positive number");
    }
	else{
	    double perimeter=2*Math.PI*radius;
	    double area=Math.PI*radius*radius;
	    System.out.printf("Perimeter of circle is %f and Area of circle is %f",perimeter,area);
    }
    }
}
