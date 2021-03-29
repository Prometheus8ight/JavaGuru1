package students.julija_katukova.lesson_10.level_3.task_8;

class InMemoryDatabase implements ProductDatabase {

    private Product[] products = new Product[1];

    @Override
    public void save(Product product) {
        if (!isFirstArrayElement()) {
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

    private boolean isFirstArrayElement() {
        return products[0] == null;
    }

    private Product[] extendArray(Product[] products) {
        Product[] out = new Product[products.length + 1];
        System.arraycopy(products, 0, out, 0, products.length);
        return out;
    }

    private void addElementToArray(Product[] products, Product product) {
        products[products.length - 1] = product;
    }

    public Product[] getProducts() {
        return products;
    }
}
