package alsa.persistence;

import alsa.entity.Product;

// co ma umet za metody
public interface Database {

    Product[] getProducts();

    Product getProduct (String name);

    void saveProduct(Product product);

    void removeProduct (Product product);

}
