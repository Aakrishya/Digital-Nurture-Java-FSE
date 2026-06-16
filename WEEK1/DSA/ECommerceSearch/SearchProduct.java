package WEEK1.DSA.ECommerceSearch;

public class SearchProduct {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        String searchProduct = "Mobile";

        boolean productFound = false;

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(searchProduct)) {

                System.out.println("Product Found");
                System.out.println("Product ID : " + product.productId);
                System.out.println("Product Name : " + product.productName);
                System.out.println("Category : " + product.category);

                productFound = true;
                break;
            }
        }

        if (!productFound) {
            System.out.println("Product Not Found");
        }
    }
}