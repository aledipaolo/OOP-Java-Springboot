import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> Inventory = new HashMap<>();

        // Creazione prodotti
        Product product1 = new Product("v8H7v", "Mela", 0.30);
        Product product2 = new Product("3oHZD", "Pera", 1.00);
        Product product3 = new Product("Fx4ZE", "Banana", 0.50);
        Product product4 = new Product("vd8NL", "Anguria", 1.40);
        Product product5 = new Product("dxAE4", "Kiwi", 1.10);
        Product product6 = new Product("3qBfT", "Melone", 0.80);


        // Aggiunta prodotti
        Inventory.put(product1.getId(),product1);
        Inventory.put(product2.getId(),product2);
        Inventory.put(product3.getId(),product3);
        Inventory.put(product4.getId(),product4);
        Inventory.put(product5.getId(),product5);
        Inventory.put(product6.getId(),product6);

        System.out.println(Inventory.size()); //stampo quantitò

        //ricerca tramite id
        String idToFind = "vd8NL";
        if (Inventory.containsKey(idToFind)) {
            Product product = Inventory.get(idToFind);
            System.out.println(product);
        } else  System.out.println("Prodotto non trovato");

        //eliminazione tramite id
        String idToRemove = "3oHZD";
        if (Inventory.containsKey(idToRemove)) {
            Inventory.remove(idToRemove);
            System.out.println(Inventory); //Dimostrazione
        } else  System.out.println("Prodotto non trovato");

        //modifica tramite id
        String idSearched = "Fx4ZE";
        Double newPrice = 9.99;
        if (Inventory.containsKey(idSearched)) {
            Product EditedProduct = Inventory.get(idSearched);
            EditedProduct.setPrice(newPrice);
            System.out.println(EditedProduct); //Dimostrazione
        } else  System.out.println("Prodotto non trovato");


        //somma intero valore inventario
        double totalValue = 0.0;
        for (Product product : Inventory.values()) {
            totalValue += product.getPrice();
        }
        System.out.println("Valore totale dell'inventario: " + totalValue);
    }
}