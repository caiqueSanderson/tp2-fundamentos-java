package TP3.Exercicio05;

public class Main {
    public static void main(String[] args) {
        Product product01 = new Product("Ovos", 25.99, 60);
        product01.viewInformation();

        product01.setPrice(30.00);
        double newPrice = product01.getPrice();
        System.out.println("Alteração feita com sucesso! Novo preço é: " + newPrice);

        product01.setQuantityInStock(100);

        product01.viewInformation();
    }
}
