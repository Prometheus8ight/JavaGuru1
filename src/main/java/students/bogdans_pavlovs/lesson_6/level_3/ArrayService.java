package students.bogdans_pavlovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch){

        boolean found = false;

        for (int i : arr) {

            if (numberToSearch == i) {

                found = true;
                break;
            }

        }
        return found;
    }

    int countOccurrences (int[] arr, int numberToSearch){

        int count = 0;

        for(int i : arr) {

            if (numberToSearch == i) {
                count++;
            }
        }

        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){

        boolean found = false;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == numberToReplace){

                arr[i] = newNumber;
                found = true;
                break;
            }
        }
        return found;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber){

        int count = 0;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == numberToReplace){

                arr[i] = newNumber;
                count++;
            }

        }
        return count;
    }


    // Sledujushie dva metoda kak to oochenj tugo shli, nadejusj praviljno ih ponjal..

    void revert(int[] arr){

        //cikl v pol dlini masiva, znachenie po seredine ne menjaetsja
        for (int i = 0; i < arr.length / 2; i++){

            int rev = arr[i]; // zakladivaem pervie znachenie masiva v rev
            arr[i] = arr[arr.length - i - 1]; // zakladivaem poslednie znachanija v pervie
            arr[arr.length - i - 1] = rev; // zakladivaem pervie v poslednii
        }

    }


    void sort(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int j = i + 1; j < arr.length; j++) { // i - tekushee znachenie masiva; j - sledujushee

                if (arr[i] > arr[j]){ // sravnivaem tekushee s sledujushem po schetu znacheniem v masive, esli tekushee boljshe to..

                    int sor = arr[i]; // zakladivaem tekushee v vremennuju peremennuju
                    arr[i] = arr[j]; // menjshee znachenie iz dvuh stavim na mesto boljshego
                    arr[j] = sor; // na mesto menjshego stavit boljshee iz vremennoj peremennoj

                }
            }

        }

    }

}
