package students.Dmitry_Gr.lesson_10.level_3;

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
