package instructor.lesson_10.transform;

class IntToStringTransformation implements Transformation<Integer, String> {

    @Override
    public String transform(Integer integer) {
        return integer.toString();
    }
}
