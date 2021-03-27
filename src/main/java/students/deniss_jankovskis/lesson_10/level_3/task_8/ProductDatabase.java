package students.deniss_jankovskis.lesson_10.level_3.task_8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
