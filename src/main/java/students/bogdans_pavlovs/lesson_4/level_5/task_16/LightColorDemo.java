package students.bogdans_pavlovs.lesson_4.level_5.task_16;

import java.util.Scanner;

class LightColorDemo {

    public static void main(String[] args) {

        LightColorDetector detector = new LightColorDetector();
        Scanner getWaveLength = new Scanner(System.in);

        System.out.print("Enter wave length: ");

        int waveLength = getWaveLength.nextInt();

        String waveColor = detector.detect(waveLength);

        System.out.println(waveColor);


    }

}
