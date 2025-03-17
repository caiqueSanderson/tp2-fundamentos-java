package TP3.Exercicio12;

public class TestGeometricFigures {
    public static void main(String[] args) {
        Circle circle01 = new Circle();
        Sphere sphere01 = new Sphere();

        circle01.radius = 3.0;
        sphere01.radius = 5.0;

        double area = circle01.calculateArea();
        double volume = sphere01.calculateVolume();

        System.out.println("A área do cículo é " + area);
        System.out.println("O volume da esfera é: " + volume);
    }
}
