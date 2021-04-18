package students.julija_katukova.lesson_12.level_5_and_6;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() >= 2000) {
            throw new ValidationException("RULE-8", "не должно быть длиннее 2000 символов", "description");
        }
        if (!product.getDescription().matches("a-zA-Z0-9")) {
            throw new ValidationException("RULE-9", "должно содержать только английские буквы и цифры, другие символы не допустимы", "description");
        }
    }

}