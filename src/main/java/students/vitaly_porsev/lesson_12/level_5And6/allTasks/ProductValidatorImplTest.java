package students.vitaly_porsev.lesson_12.level_5And6.allTasks;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule8_v1();
        test.rule9_v1();
        test.allRule_v1();
        test.allRule_v2();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("Or", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title length must be longer"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("To Kill A Mockingbird By Harper Lee." +
                "Hardcover book first published July 11, 1960. Novel won 1961 Pulitzer Prize", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title length must be shorter"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("Апельсин", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only english letters and numbers"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("Orange", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can`t be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("Orange", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can`t be zero or less"), "rule6");
    }

    public void rule8_v1() {
        Product product = new Product("Orange", 2, "Cloud Atlas\n" +
                "Cloud Atlas\n" +
                "by David Mitchell\n" +
                "David Mitchell entices his readers on to a rollercoaster, and at first they wonder if they want to get off. " +
                "Then - at least in my case - they can't bear the journey to end. Like Scheherazade," +
                " and like serialised Victorian novels and modern soaps, he ends his episodes on cliffhangers" +
                " and missed heartbeats. But unlike these, he starts his next tale in another place, in another time," +
                " in another vocabulary, and expects us to go through it all again. Trust the tale. He reaches a cumulative ending of all of them," +
                " and then finishes them all individually, giving a complete narrative pleasure that is rare.\n" +
                "\n" +
                "The first tale is about a 19th-century American lawyer, Adam Ewing, crossing the Pacific in 1850, " +
                "meeting Maoris and missionaries, a seedy English physician and some nasty sailors. " +
                "The second is about a young British composer in 1931, who cons a dying genius into " +
                "taking him on as an amanuensis, and then makes love to his wife and daughter. " +
                "This narrator, Robert Frobisher, composes the Cloud Atlas Sextet \"for overlapping soloists\" on piano, " +
                "clarinet, cello, flute, oboe and violin, \"each in its own language of key, scale and colour\". " +
                "Frobisher's tale is told in a series of letters to his lover, Rufus Sixsmith," +
                " who later appears as a nuclear scientist in Reagan's California in the 1970s. " +
                "This Californian thriller is the tale of Luisa Rey, a journalist who uncovers a corporate " +
                "nuclear scandal and is at constant risk of assassination. The fourth voice is Timothy Cavendish, " +
                "a 1980s London vanity publisher, trapped in an old people's home near Hull. " +
                "The fifth is the pre-execution testimony of Sonmi-451, a cloned slave in some future state, " +
                "who has acquired intelligence and vision. The sixth, and central one, is the storytelling voice of Zachry," +
                " a tribesman after the fall of the civilised world, who is back in the Pacific islands where the linear narrative began." +
                " The novel opens with one ship - the Prophetess - and ends with another ship that contains the survivors of Civ'lise, the Prescients.");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description length can`t be longer than 2000 symbols"), "rule8");
    }

    public void rule9_v1() {
        Product product = new Product("Orange", 2, "Хеллой! Итс найс дескриптион!");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only english letters and numbers"), "rule9");
    }

    public void allRule_v1() {
        Product product = new Product("Апельсин", 0, "Хеллой! Итс найс дескриптион!");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "allRules");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "allRules");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "allRules");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only english letters and numbers"), "allRules");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-6"), "allRules");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "allRules");
        checkResult(exceptions.get(1).getDescription().equals("Price can`t be zero or less"), "allRules");
        checkResult(exceptions.get(2).getRuleName().equals("RULE-9"), "allRules");
        checkResult(exceptions.get(2).getFieldName().equals("description"), "allRules");
        checkResult(exceptions.get(2).getDescription().equals("Description must contain only english letters and numbers"), "allRules");
    }

    public void allRule_v2() {
        Product product = new Product(null, null, "Cloud Atlas\\n\" +\n" +
                "                \"Cloud Atlas\\n\" +\n" +
                "                \"by David Mitchell\\n\" +\n" +
                "                \"David Mitchell entices his readers on to a rollercoaster, and at first they wonder if they want to get off. \" +\n" +
                "                \"Then - at least in my case - they can't bear the journey to end. Like Scheherazade,\" +\n" +
                "                \" and like serialised Victorian novels and modern soaps, he ends his episodes on cliffhangers\" +\n" +
                "                \" and missed heartbeats. But unlike these, he starts his next tale in another place, in another time,\" +\n" +
                "                \" in another vocabulary, and expects us to go through it all again. Trust the tale. He reaches a cumulative ending of all of them,\" +\n" +
                "                \" and then finishes them all individually, giving a complete narrative pleasure that is rare.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The first tale is about a 19th-century American lawyer, Adam Ewing, crossing the Pacific in 1850, \" +\n" +
                "                \"meeting Maoris and missionaries, a seedy English physician and some nasty sailors. \" +\n" +
                "                \"The second is about a young British composer in 1931, who cons a dying genius into \" +\n" +
                "                \"taking him on as an amanuensis, and then makes love to his wife and daughter. \" +\n" +
                "                \"This narrator, Robert Frobisher, composes the Cloud Atlas Sextet \\\"for overlapping soloists\\\" on piano, \" +\n" +
                "                \"clarinet, cello, flute, oboe and violin, \\\"each in its own language of key, scale and colour\\\". \" +\n" +
                "                \"Frobisher's tale is told in a series of letters to his lover, Rufus Sixsmith,\" +\n" +
                "                \" who later appears as a nuclear scientist in Reagan's California in the 1970s. \" +\n" +
                "                \"This Californian thriller is the tale of Luisa Rey, a journalist who uncovers a corporate \" +\n" +
                "                \"nuclear scandal and is at constant risk of assassination. The fourth voice is Timothy Cavendish, \" +\n" +
                "                \"a 1980s London vanity publisher, trapped in an old people's home near Hull. \" +\n" +
                "                \"The fifth is the pre-execution testimony of Sonmi-451, a cloned slave in some future state, \" +\n" +
                "                \"who has acquired intelligence and vision. The sixth, and central one, is the storytelling voice of Zachry,\" +\n" +
                "                \" a tribesman after the fall of the civilised world, who is back in the Pacific islands where the linear narrative began.\" +\n" +
                "                \" The novel opens with one ship - the Prophetess - and ends with another ship that contains the survivors of Civ'lise, the Prescients.");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "allRules");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "allRules");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "allRules");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "allRules");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-5"), "allRules");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "allRules");
        checkResult(exceptions.get(1).getDescription().equals("Price can`t be empty"), "allRules");
        checkResult(exceptions.get(2).getRuleName().equals("RULE-8"), "allRules");
        checkResult(exceptions.get(2).getFieldName().equals("description"), "allRules");
        checkResult(exceptions.get(2).getDescription().equals("Description length can`t be longer than 2000 symbols"), "allRules");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
