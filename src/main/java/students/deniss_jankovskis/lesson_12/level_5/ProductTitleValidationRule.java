package students.deniss_jankovskis.lesson_12.level_5;

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1", "should not be empty", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "must not be shorter than 3 characters", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "must not be longer than 100 characters", "title");
        }
        if (!product.getTitle().matches("a-zA-Z0-9")) {
            throw new ValidationException("RULE-4", "must contain only English letters and numbers, other characters are not allowed", "title");
        }
    }
}
