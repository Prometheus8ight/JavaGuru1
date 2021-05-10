package students.vitaly_porsev.lesson_15.level_5.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemNameChecker;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemProcessor;

public class ConjuredProcessor implements ItemProcessor {

    private final ItemNameChecker checker;

    public ConjuredProcessor(ItemNameChecker checker) {
        this.checker = checker;
    }

    @Override
    public boolean canProcess(Item item) {
        return checker.checkItemName(item.getName(), "conjured");
    }

    @Override
    public void process(Item item) {
        if (item.getQuality() > 1 && item.getSellIn() > 0) {
            item.setQuality(item.getQuality() - 2);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getQuality() == 1 && item.getSellIn() > 0) {
            item.setQuality(0);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getQuality() > 3 && item.getSellIn() <= 0) {
            item.setQuality(item.getQuality() - 4);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getQuality() <= 3 && item.getSellIn() <= 0) {
            item.setQuality(0);
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
