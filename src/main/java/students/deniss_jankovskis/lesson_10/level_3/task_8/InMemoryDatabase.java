package students.deniss_jankovskis.lesson_10.level_3.task_8;

class InMemoryDatabase implements ProductDatabase {

    Product[] products = new Product[0];

    private boolean firstArrayElement() {
        return products[1] == null;
    }

    private Product[] extendArray(Product[] products) {
        Product[] newArray = new Product[products.length + 1];
        for (int i = 0; i < products.length; ++i) {
            newArray[i] = products[i];
        }
        products = newArray;

        return newArray;
    }

    private void addElementToArray(Product[] products, Product product) {
        products[products.length - 1] = product;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (!firstArrayElement()) {
            this.products = extendArray(products);
        }
        addElementToArray(products, product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
