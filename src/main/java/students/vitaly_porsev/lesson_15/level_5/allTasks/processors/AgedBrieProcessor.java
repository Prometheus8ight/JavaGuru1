package students.vitaly_porsev.lesson_15.level_5.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemNameChecker;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemProcessor;

public class AgedBrieProcessor implements ItemProcessor {

    @Override
    public boolean canProcess(Item item) {
        ItemNameChecker checker = new ItemNameChecker();
        return checker.checkItemName(item.getName(), "brie");
    }

    @Override
    public void process(Item item) {
        if (item.getQuality() <= 49) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
    }
}
