package students.andrew_galashin.lesson_10.level_3.task_8;

    class InMemoryDatabase implements ProductDatabase {

    private Product[] products = new Product[1];

    private boolean firstElem() {
        return products[0] == null;
    }

    private Product[] array(Product[] products) {
        Product[] x = new Product[products.length + 1];
        System.arraycopy(products, 0, x, 0, products.length);
        return x;
    }

    private void addElem(Product[] products, Product product) {
        products[products.length - 1] = product;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (!firstElem()) {
            this.products = array(products);
        }
        addElem(products, product);
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
