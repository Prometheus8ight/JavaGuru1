package students.vitaly_porsev.lesson_12.level_5And6.allTasks;

class ProductPriceValidationRule implements FieldValidationRule, ProductValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null || product.getPrice().toString().isEmpty()) {
            throw new ValidationException("RULE-5", "price", "Price can`t be empty");
        }
        if (product.getPrice() < 1) {
            throw new ValidationException("RULE-6", "price", "Price can`t be zero or less");
        }
    }

}
