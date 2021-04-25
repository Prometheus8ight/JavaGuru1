package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.List;
import java.util.Locale;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product, List<ValidationException> arr) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            arr.add(new ValidationException("Rule_7", "Description cannot be more then two thousands", "rule7"));
        } else if (!letterAndDigitsCheck(product.getDescription())) {
            arr.add(new ValidationException("Rule_8", "No symbols except latin letters and digits", "rule8"));
        }
    }

    private boolean letterAndDigitsCheck(String title) {
        for (int i = 0; i < title.length(); i++) {
            int x = title.toUpperCase(Locale.ROOT).codePointAt(i);
            if (x < 48 && x != 32) {
                return false;
            } else if (x > 90) {
                return false;
            } else if (x > 57 && x < 65) {
                return false;
            }
        }
        return true;
    }

}