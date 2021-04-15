package students.deniss_jankovskis.lesson_12.level_5;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}
