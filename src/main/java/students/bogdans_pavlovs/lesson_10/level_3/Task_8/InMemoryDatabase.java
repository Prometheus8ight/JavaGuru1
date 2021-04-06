package students.bogdans_pavlovs.lesson_10.level_3.Task_8;

public class InMemoryDatabase implements ProductDatabase{

    Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {

        products = extendProducts();

        //в последнюю ячейку нового массива сохраняем новый продукт
        products[products.length - 1] = product;

    }


    private Product[] extendProducts(){

        //создаём новый массив длиннее предыдущего на 1
        Product[] newProducts = new Product[products.length + 1];

        if (products.length == 0) {

            return newProducts;

        } else {

            //копируем все содержимое сторого массива в новый
            for (int i = 0; i < products.length; i++) {

                newProducts[i] = products[i];
            }

            return newProducts;
        }

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
