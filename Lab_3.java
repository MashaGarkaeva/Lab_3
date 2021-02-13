package com.company;
import java.util.Scanner;
public class Lab_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("(cos1/sin1)*((cos1+cos2)/(sin1+sin2)*...*((cos1+cos2+...+cosN)/(sin1+sin2+...+sinN)))");
        System.out.print("Введите число N: ");
        double a = 0;
        double c = 0;
        double sum = 0;
        int n = in.nextInt();
        double s=(Math.cos(1)/(Math.sin(1)));
        for (int i=1; i<=n;i++){
            double ch=Math.cos(i);
            double zn=Math.sin(i);
            c = ch/zn;
            sum = c + c;
        }
    System.out.println(s*sum);
    }
}
