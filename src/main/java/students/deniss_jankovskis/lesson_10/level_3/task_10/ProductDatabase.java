package students.deniss_jankovskis.lesson_10.level_3.task_10;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
