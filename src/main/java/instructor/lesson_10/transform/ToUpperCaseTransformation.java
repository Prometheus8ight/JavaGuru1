package instructor.lesson_10.transform;

class ToUpperCaseTransformation implements Transformation<String, String> {

    @Override
    public String transform(String in) {
        return in.toUpperCase();
    }
}
