package TP3.Exercicio04;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Preço inserido é inválido!");
        }

    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock > 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantidade inserida é inválida!");
        }

    }

    public void viewInformation() {
        System.out.println("\n Informações do Produto: ");
        System.out.println("Nome: " + name);
        System.out.println("Preço: R$" + price);
        System.out.println("Quantidade em estoque: " + quantityInStock);
    }
}
