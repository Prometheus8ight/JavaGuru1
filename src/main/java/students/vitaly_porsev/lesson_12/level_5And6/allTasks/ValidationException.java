package students.vitaly_porsev.lesson_12.level_5And6.allTasks;

class ValidationException extends Exception {

    private String ruleName;

    private String description;

    private String fieldName;

    public ValidationException(String ruleName, String fieldName, String description) {
        this.ruleName = ruleName;
        this.fieldName = fieldName;
        this.description = description;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
