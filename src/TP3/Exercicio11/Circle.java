package TP3.Exercicio11;

public class Circle {
    double radius;

    public double calculateArea(){
        double area = Math.PI * (radius * radius);
        System.out.println("A área do cículo é " + area);
        return area;
    }
}
