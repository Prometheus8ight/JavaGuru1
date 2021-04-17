package students.vitaly_porsev.lesson_13.level_5.allTasks;

public class StringCalculator {

    public int add(String numbers) {
        int num = 0;
        if (numbers == null ||numbers.isEmpty() || numbers.endsWith("\n")) {
            return 0;
        } else {
            numbers = numbers.replaceAll("[^0-9]", "");
            String[] numStr = numbers.split("");
            for (String s : numStr) {
                num += Integer.parseInt(s);
            }
        }
        return num;
    }
}
