package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.List;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product, List<ValidationException> arr) throws ValidationException {
        if (product.getPrice() == null) {
            arr.add(new ValidationException("Rule_5", "Price cannot be empty", "rule5"));
        } else if (product.getPrice() <= 0) {
            arr.add(new ValidationException("Rule_6", "Price cannot be equal or less then zero", "rule6"));
        }
    }

}