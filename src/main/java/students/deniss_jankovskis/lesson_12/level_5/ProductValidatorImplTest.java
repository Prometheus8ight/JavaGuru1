package students.deniss_jankovskis.lesson_12.level_5;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule8();
        test.rule9();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
        System.out.println();
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
        System.out.println();
    }

    public void rule2() {
        Product product = new Product("An", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title must not be shorter than 3 characters"), "rule2");
        System.out.println();
    }

    public void rule3() {
        Product product = new Product("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title must not be longer than 100 characters"), "rule3");
        System.out.println();
    }

    public void rule4() {
        Product product = new Product("Book123", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only English letters and numbers, other characters are not allowed"), "rule4");
        System.out.println();
    }

    public void rule5() {
        Product product = new Product("Book", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price should not be empty"), "rule5");
        System.out.println();
    }

    public void rule6() {
        Product product = new Product("Book", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be greater than 0"), "rule6");
        System.out.println();
    }

    public void rule8() {
        Product product = new Product("Book", 1, "Scott Fitzgerald, published in 1925 by Charles Scribner's Sons. Set in Jazz Age New York, " +
                "the novel tells the tragic story of Jay Gatsby, a self-made millionaire, and his pursuit of Daisy Buchanan, a wealthy young woman whom he loved in his youth.");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("Description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description must not be longer than 2000 characters"), "rule8");
        System.out.println();
    }

    public void rule9() {
        Product product = new Product("Book", 2, "Head First Java\n" +
                "Book by Bert Bates and Kathy Sierra");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only English letters and numbers, other characters are not allowed"), "rule9");
        System.out.println();
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
