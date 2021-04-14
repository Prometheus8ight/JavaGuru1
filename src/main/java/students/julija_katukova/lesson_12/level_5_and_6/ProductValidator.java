package students.julija_katukova.lesson_12.level_5_and_6;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}
