package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.List;
import java.util.Locale;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product, List<ValidationException> arr) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")) {
            arr.add(new ValidationException("Rule_1", "Title cannot be empty", "rule1"));
        } else if (product.getTitle().length() < 3) {
            arr.add(new ValidationException("Rule_2", "Title cannot be shorter then three symbols", "rule2"));
        } else if (product.getTitle().length() > 100) {
            arr.add(new ValidationException("Rule_3", "Title cannot be longer then hundred symbols", "rule3"));
        } else if (!letterAndDigitsCheck(product.getTitle())) {
            arr.add(new ValidationException("Rule_4", "No symbols except latin letters and digits", "rule4"));
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