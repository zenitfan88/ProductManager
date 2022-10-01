package ru.netology.domain;

public class ProductManger {

    private Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        Product[] findAll = new Product[products.length];
        System.arraycopy(products, 0, findAll, 0, products.length);
        return findAll;
    }

    public Product[] removeByID(int id) {
        Product[] tmp = new Product[0];
        for (Product product : products) {
            if (product.getId() != id) {
                Product[] newtmp = new Product[tmp.length + 1];
                for (int i = 0; i < tmp.length; i++) {
                    newtmp[i] = tmp[i];
                }
                newtmp[newtmp.length - 1] = product;
                tmp = newtmp;
            }
        }
        return tmp;
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}

