package students.kristine_paskevica.lesson_5.level_6;
import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];                    // izveido metodi, lai izveidotu masīvu ar norādītu tā garumu
    }

    public void fillRandomly(int[] array) {      //izveido metodi, lai aizpildītu masīva šūnas ar nejaušiem sk
        Random aizpilde = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aizpilde.nextInt();
        }
    }

    public void print(int[] masivs) {               //izveido metodi, lai izprintētu konsolē masīva šūnās esošos sk
        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Jūsu masīvs satur: " + masivs[i]);
        }
    }

    public int findMax(int[] array) {
        int maksVertiba = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maksVertiba) {
                maksVertiba = array[i];
            }
        }
        return maksVertiba;
        }

    public int findMin(int[] array) {
        int minVertiba = array[0];

        for (int i = 0; i < array.length; i++){

            if(array[i] < minVertiba){
                minVertiba = array[i];
            }
        }
        return minVertiba;
    }
}
