package students.vitaly_porsev.lesson_15.level_5.allTasks;

import java.util.Locale;

public class ItemNameChecker {

    public boolean checkItemName(String itemName, String itemToSearch) {
        String[] splitted = stringSplitter(itemName);
        for (String str : splitted) {
           if(str.toLowerCase(Locale.ROOT).equals(itemToSearch.toLowerCase(Locale.ROOT))){
               return true;
           }
        }
        return false;
    }

    private String[] stringSplitter(String itemName) {
        return itemName.split("[, . ']+");
    }

}
