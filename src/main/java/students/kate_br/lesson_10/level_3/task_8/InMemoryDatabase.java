package students.kate_br.lesson_10.level_3.task_8;

class InMemoryDatabase implements ProductDatabase {

    Product[] arr = new Product[0];

    public Product[] getArr() {
        return arr;
    }

    Product[] copyArrInNew() {
        Product[] newArr = new Product[arr.length + 1];
        if (arr.length == 0) {
            return newArr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
        }
        return newArr;

    }

    @Override
    public void save(Product product) {
        arr = copyArrInNew();
        arr[arr.length - 1] = product;
    }


    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : arr){
            if (product != null && product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }
}
