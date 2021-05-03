package students.vitaly_porsev.lesson_15.level_5.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemNameChecker;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemProcessor;

public class NormalItemProcessor implements ItemProcessor {

    @Override
    public boolean canProcess(Item item) {
        ItemNameChecker checker = new ItemNameChecker();
        return !checker.checkItemName(item.getName(), "brie")
                && !checker.checkItemName(item.getName(), "sulfuras")
                && !checker.checkItemName(item.getName(), "passes")
                && !checker.checkItemName(item.getName(), "conjured");
    }

    @Override
    public void process(Item item) {
        if (item.getSellIn() > 0 && item.getQuality() > 0) {
            item.setSellIn(item.getSellIn() - 1);
            item.setQuality(item.getQuality() - 1);
        } else if (item.getSellIn() <= 0 && item.getQuality() > 1) {
            item.setQuality(item.getQuality() - 2);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getSellIn() <= 0 && item.getQuality() == 1) {
            item.setSellIn(item.getSellIn() - 1);
            item.setQuality(0);
        } else if (item.getQuality() == 0) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}