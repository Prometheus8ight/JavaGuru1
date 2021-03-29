package instructor.lesson_10.transform;

class ToLowerCaseTransformation implements Transformation<String, String> {

    @Override
    public String transform(String in) {
        return in.toLowerCase();
    }
}
