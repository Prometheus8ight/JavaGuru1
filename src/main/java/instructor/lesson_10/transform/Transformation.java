package instructor.lesson_10.transform;

interface Transformation<IN, OUT> {

    OUT transform(IN in);

}

