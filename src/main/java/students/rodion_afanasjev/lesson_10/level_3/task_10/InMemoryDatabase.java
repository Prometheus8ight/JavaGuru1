package students.rodion_afanasjev.lesson_10.level_3.task_10;

import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    private Product[] productArr = new Product[0];

    public Product[] getProductArr(){
        return productArr;
    }

    @Override
    public void save(Product product) {
        productArr = newLength();
        productArr[productArr.length - 1] = product;
    }

    private Product[] newLength(){
        Product[] newProductArr = new Product[productArr.length + 1];
        if (productArr.length == 0){
            return newProductArr;
        } else {
            for (int i = 0; i < productArr.length; i++){
                newProductArr[i] = productArr[i];
            }
        }
        return newProductArr;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : productArr){
            if (product != null && product.getTitle().equals(productTitle)){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

}
