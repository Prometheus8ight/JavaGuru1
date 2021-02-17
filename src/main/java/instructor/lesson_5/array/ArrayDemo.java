package instructor.lesson_5.array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] covidCasesJanuary = new int[31];
        covidCasesJanuary[0] = 900;
        covidCasesJanuary[1] = 950;
        covidCasesJanuary[2] = 800;
        covidCasesJanuary[3] = 1001;

        System.out.println("covidCasesJanuary[0] = " + covidCasesJanuary[0]);
        System.out.println("covidCasesJanuary[1] = " + covidCasesJanuary[1]);
        System.out.println("covidCasesJanuary[2] = " + covidCasesJanuary[2]);
        System.out.println("covidCasesJanuary[3] = " + covidCasesJanuary[3]);
        System.out.println("covidCasesJanuary[4] = " + covidCasesJanuary[4]);
        System.out.println("covidCasesJanuary[5] = " + covidCasesJanuary[5]);

        System.out.println("Arrays.toString(covidCasesJanuary) = " + Arrays.toString(covidCasesJanuary));
        System.out.println("covidCasesJanuary.length = " + covidCasesJanuary.length);

        System.out.println();

        String[] headers = {"Name", "Last Name", "Age", "Gender"};
        System.out.println("Arrays.toString(headers) = " + Arrays.toString(headers));
        System.out.println("headers.length = " + headers.length);

//                new String[4];
//        headers[0] = "Name";
//        headers[1] = "Last Name";
//        headers[2] = "Age";
//        headers[3] = "Gender";
    }
}
