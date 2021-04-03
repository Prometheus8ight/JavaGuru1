package students.alex_kalashnikov.lesson_10.level_3.task_10;

import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    private int count;
    private Product[] arr;

    public int getCount() {
        return count;
    }

    public Product[] getArr() {
        return arr;
    }

    public InMemoryDatabase() {
        this.count = 0;
        this.arr = new Product[0];
    }

    private Product[] createArr(int count) {
        return new Product[count];
    }

    @Override
    public void save(Product product) {
        count++;
        Product[] newArr = createArr(count);
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        arr[arr.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
//        Optional<Product> nonEmptyOptional = Optional.of(productTitle);
        Optional<Product> emptyOptional = Optional.empty();
        for (Product product : arr) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return emptyOptional;
    }

}