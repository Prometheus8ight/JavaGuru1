package students.vitaly_porsev.lesson_10.level_3.task_8;

public class InMemoryDatabase implements ProductDatabase {

    private Product[] productArray = new Product[0];

    public Product[] getProductArray() {
        return productArray;
    }

    @Override
    public void save(Product product) {
        productArray = copyAndNewLength();
        productArray[productArray.length - 1] = product;
    }

    private Product[] copyAndNewLength() {
        Product[] newProductArray = new Product[productArray.length + 1];
        if (productArray.length == 0) {
            return newProductArray;
        } else {
            for (int i = 0; i < productArray.length; i++) {
                newProductArray[i] = productArray[i];
            }
        }
        return newProductArray;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productArray) {
            if (product != null && product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
