package students.rodion_afanasjev.lesson_10.level_3.task_6;

class ToLowerCase implements Converter<String, String> {

    public String convert(String text){
        return text.toLowerCase();
    }

}
