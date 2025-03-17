package TP3.Exercicio03;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock){
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }

    public void viewInformation(){
        System.out.println("\n Informações do Produto: ");
        System.out.println("Nome: " + name);
        System.out.println("Preço: " + price);
        System.out.println("Quantidade em estoque: " + quantityInStock);
    }
}
