package students.vitaly_porsev.lesson_12.level_5And6.allTasks;

public class ProductDescriptionValidationRule implements FieldValidationRule, ProductValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-8", "description", "Description length can`t be longer than 2000 symbols");
        }
        if (!product.getDescription().matches("[a-zA-Z0-9]+")) {
            throw new ValidationException("RULE-9", "description", "Description must contain only english letters and numbers");
        }
    }
}
