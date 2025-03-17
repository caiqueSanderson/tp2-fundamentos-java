package TP3.Exercicio04;

public class Main {
    public static void main(String[] args){
        Product product01 = new Product("Ovos",25.99,60);
        product01.setPrice(30.00);
        product01.setQuantityInStock(100);

        product01.viewInformation();
    }
}
