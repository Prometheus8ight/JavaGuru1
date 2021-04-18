package students.vitaly_porsev.lesson_12.level_5And6.allTasks;

class ProductTitleValidationRule implements FieldValidationRule, ProductValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            throw new ValidationException("RULE-1", "title", "Title can not be empty");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "title", "Title length must be longer");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "title", "Title length must be shorter");
        }
        if (!product.getTitle().matches("[a-zA-Z0-9]+")) {
            throw new ValidationException("RULE-4", "title", "Title must contain only english letters and numbers");
        }
    }

}