package students.bogdans_pavlovs.lesson_10.level_3.Task_8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
