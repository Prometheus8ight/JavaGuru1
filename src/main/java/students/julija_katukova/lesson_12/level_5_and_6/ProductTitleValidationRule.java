package students.julija_katukova.lesson_12.level_5_and_6;

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1", "не должно быть пустым", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "не должно быть короче 3 символов", "title");
        }
        if (product.getTitle().length() >= 100) {
            throw new ValidationException("RULE-3", "не должно быть длиннее 100 символов", "title");
        }
        if (!product.getTitle().matches("a-zA-Z0-9")) {
            throw new ValidationException("RULE-4", "должно содержать только английские буквы и цифры, другие символы не допустимы", "title");
        }
    }
}