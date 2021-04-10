package students.andrew_galashin.lesson_10.level_3.task_7;

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
    //Нет, интерфейс не является функциональным, так как функциональным считается интерфейс с одним абстрактным методом.
}
