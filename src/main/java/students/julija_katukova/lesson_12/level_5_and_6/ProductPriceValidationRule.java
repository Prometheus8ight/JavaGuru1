package students.julija_katukova.lesson_12.level_5_and_6;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "не должна быть пустой", "price");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "должна быть больше 0", "price");
        }
    }
}
