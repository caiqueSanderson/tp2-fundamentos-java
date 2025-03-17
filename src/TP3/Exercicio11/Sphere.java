package TP3.Exercicio11;

public class Sphere {
    double radius;

    public double calculateVolume(){
        double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
        System.out.println("O volume da esfera é: " + volume);
        return volume;
    }
}
