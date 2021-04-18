package students.deniss_jankovskis.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() >= 2000) {
            throw new ValidationException("RULE-8", "must not be longer than 2000 characters", "description");
        }
        if (!product.getDescription().matches("a-zA-Z0-9")) {
            throw new ValidationException("RULE-9", "must contain only English letters and numbers, other characters are not allowed", "description");
        }
    }
}
