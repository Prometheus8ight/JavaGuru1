package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
            new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {

        ProductValidatorImplTest victim = new ProductValidatorImplTest();
        victim.testRule_1_TitleEmpty1();
        victim.testRule_1_TitleEmpty2();
        victim.testRule_2_TitleIsShorterThenThreeSymbols1();
        victim.testRule_2_TitleIsShorterThenThreeSymbols2();
        victim.testRule_3_TitleIsLongerThenHundredSymbols1();
        victim.testRule_3_TitleIsLongerThenHundredSymbols2();
        victim.testRule_4_TitleHasWrongSymbols1();
        victim.testRule_4_TitleHasWrongSymbols2();
        victim.testRule_4_TitleHasWrongSymbols3();
        victim.testRule_5_PriceEmpty1();
        victim.testRule_5_PriceEmpty2();
        victim.testRule_6_PriceIsEqualOrLessThenZero1();
        victim.testRule_6_PriceIsEqualOrLessThenZero2();
        victim.testRule_6_PriceIsEqualOrLessThenZero3();
        victim.testRule_7_DesIsMoreThenTwoThousands1();
        victim.testRule_7_DesIsMoreThenTwoThousands2();
        victim.testRule_8_DesHasWrongSymbols1();
        victim.testRule_8_DesHasWrongSymbols2();
        victim.testRule_8_DesHasWrongSymbols3();
        victim.testMultipleRules1();
        victim.testMultipleRules2();
        victim.testMultipleRules3();

    }

    void test(List<ValidationException> expectedResult, List<ValidationException> realResult, String name) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println(name + "Test is OK!");
        } else {
            System.out.println(name + "Test is FAILED!");
        }
    }

    void testRule_1_TitleEmpty1() {
        Product product = new Product(null, 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_1", "Title cannot be empty", "rule1"));
        test(expectedResult, validator.validate(product), "RULE 1: ");
    }

    void testRule_1_TitleEmpty2() {
        Product product = new Product("", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_1", "Title cannot be empty", "rule1"));
        test(expectedResult, validator.validate(product), "RULE 1: ");
    }

    void testRule_2_TitleIsShorterThenThreeSymbols1() {
        Product product = new Product("AB", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_2", "Title cannot be shorter then three symbols", "rule2"));
        test(expectedResult, validator.validate(product), "RULE 2: ");
    }

    void testRule_2_TitleIsShorterThenThreeSymbols2() {
        Product product = new Product("ABC", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 2: ");
    }

    void testRule_3_TitleIsLongerThenHundredSymbols1() {
        Product product = new Product("123456789-123456789-123456789-" +
                "123456789-123456789-123456789-123456789-123456789-123456789-" +
                "123456789-1", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_3", "Title cannot be longer then hundred symbols", "rule3"));
        test(expectedResult, validator.validate(product), "RULE 3: ");
    }

    void testRule_3_TitleIsLongerThenHundredSymbols2() {
        Product product = new Product("123456789 123456789 1234567890" +
                "123456789 123456789 123456789 123456789 123456789 123456789" +
                "123456789 1", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 3: ");
    }

    void testRule_4_TitleHasWrongSymbols1() {
        Product product = new Product("абв-555", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_4", "No symbols except latin letters and digits", "rule4"));
        test(expectedResult, validator.validate(product), "RULE 4: ");
    }

    void testRule_4_TitleHasWrongSymbols2() {
        Product product = new Product("ABC&555", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_4", "No symbols except latin letters and digits", "rule4"));
        test(expectedResult, validator.validate(product), "RULE 4: ");
    }

    void testRule_4_TitleHasWrongSymbols3() {
        Product product = new Product("ABC555", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 4: ");
    }

    void testRule_5_PriceEmpty1() {
        Product product = new Product("ABC", null, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_5", "Price cannot be empty", "rule5"));
        test(expectedResult, validator.validate(product), "RULE 5: ");
    }

    void testRule_5_PriceEmpty2() {
        Product product = new Product("ABC", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 5: ");
    }

    void testRule_6_PriceIsEqualOrLessThenZero1() {
        Product product = new Product("ABC", 0, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_6", "Price cannot be equal or less then zero", "rule6"));
        test(expectedResult, validator.validate(product), "RULE 6: ");
    }

    void testRule_6_PriceIsEqualOrLessThenZero2() {
        Product product = new Product("ABC", -5, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_6", "Price cannot be equal or less then zero", "rule6"));
        test(expectedResult, validator.validate(product), "RULE 6: ");
    }

    void testRule_6_PriceIsEqualOrLessThenZero3() {
        Product product = new Product("ABC", 1, "product description");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 6: ");
    }

    void testRule_7_DesIsMoreThenTwoThousands1() {
        Product product = new Product("ABC", 1, generateStringWith2000Symbols() + "A");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_7", "Description cannot be more then two thousands", "rule7"));
        test(expectedResult, validator.validate(product), "RULE 7: ");
    }

    void testRule_7_DesIsMoreThenTwoThousands2() {
        Product product = new Product("ABC", 1, generateStringWith2000Symbols());
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 7: ");
    }

    void testRule_8_DesHasWrongSymbols1() {
        Product product = new Product("ABC", 1, "Abc Абв");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_8", "No symbols except latin letters and digits", "rule8"));
        test(expectedResult, validator.validate(product), "RULE 8: ");
    }

    void testRule_8_DesHasWrongSymbols2() {
        Product product = new Product("ABC", 1, "Abc&ABC");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_8", "No symbols except latin letters and digits", "rule8"));
        test(expectedResult, validator.validate(product), "RULE 8: ");
    }

    void testRule_8_DesHasWrongSymbols3() {
        Product product = new Product("ABC", 1, "AbcABC");
        List<ValidationException> expectedResult = new ArrayList<>();
        test(expectedResult, validator.validate(product), "RULE 8: ");
    }

    void testMultipleRules1() {
        Product product = new Product(null, 0, "Abc&ABC");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_1", "Title cannot be empty", "rule1"));
        expectedResult.add(new ValidationException("Rule_6", "Price cannot be equal or less then zero", "rule6"));
        expectedResult.add(new ValidationException("Rule_8", "No symbols except latin letters and digits", "rule8"));
        test(expectedResult, validator.validate(product), "RULES 1,6,8: ");
    }

    void testMultipleRules2() {
        Product product = new Product("Ю1", null, generateStringWith2000Symbols() + "Hello");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_2", "Title cannot be shorter then three symbols", "rule2"));
        expectedResult.add(new ValidationException("Rule_5", "Price cannot be empty", "rule5"));
        expectedResult.add(new ValidationException("Rule_7", "Description cannot be more then two thousands", "rule7"));
        test(expectedResult, validator.validate(product), "RULES 2,5,7: ");
    }

    void testMultipleRules3() {
        Product product = new Product("Ю1", 100, generateStringWith2000Symbols() + "Hello");
        List<ValidationException> expectedResult = new ArrayList<>();
        expectedResult.add(new ValidationException("Rule_2", "Title cannot be shorter then three symbols", "rule2"));
        expectedResult.add(new ValidationException("Rule_7", "Description cannot be more then two thousands", "rule7"));
        test(expectedResult, validator.validate(product), "RULES 2,7: ");
    }

    private String generateStringWith2000Symbols() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            builder.append("1234567890");
        }
        return builder.toString();
    }

}