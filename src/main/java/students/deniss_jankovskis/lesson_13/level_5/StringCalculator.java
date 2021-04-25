package students.deniss_jankovskis.lesson_13.level_5;

class StringCalculator {

    int add(String numbers) {
        if (numbers.isEmpty() || numbers.endsWith("\n")) {
            return 0;
        } else {
            String[] number = numbers.replaceAll("[^0-9]", "").split("");
            int result = 0;
            for (String x : number) {
                result += Integer.parseInt(x);
            }
            return result;
        }
    }
}
