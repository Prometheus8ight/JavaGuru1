package students.deniss_jankovskis.lesson_12.level_5;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-5", "should not be empty", "price");
        }
        if (product.getPrice() < 1) {
            throw new ValidationException("RULE-6", "must be greater than 0", "price");
        }
    }
}
