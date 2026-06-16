package WEEK1.DSA.ECommerceSearch;

public class SearchProduct {

    // Linear Search
    public static Product linearSearch(Product[] products, String productName) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String productName) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            int result =
                    products[middle].productName.compareToIgnoreCase(productName);

            if (result == 0) {
                return products[middle];
            }

            if (result < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        String searchItem = "Mobile";

        System.out.println("Linear Search Result");

        Product linearResult =
                linearSearch(products, searchItem);

        if (linearResult != null) {

            System.out.println("Product Found");
            System.out.println("ID : " + linearResult.productId);
            System.out.println("Name : " + linearResult.productName);
            System.out.println("Category : " + linearResult.category);
        }

        System.out.println();

        System.out.println("Binary Search Result");

        Product binaryResult =
                binarySearch(products, searchItem);

        if (binaryResult != null) {

            System.out.println("Product Found");
            System.out.println("ID : " + binaryResult.productId);
            System.out.println("Name : " + binaryResult.productName);
            System.out.println("Category : " + binaryResult.category);
        }
    }
}