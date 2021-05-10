package students.vitaly_porsev.lesson_15.level_5.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemNameChecker;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemProcessor;

public class BackStagePassProcessor implements ItemProcessor {

    private final ItemNameChecker checker;

    public BackStagePassProcessor(ItemNameChecker checker) {
        this.checker = checker;
    }

    @Override
    public boolean canProcess(Item item) {
        return checker.checkItemName(item.getName(), "passes");
    }

    @Override
    public void process(Item item) {
        if (item.getSellIn() > 10) {
            item.setQuality(item.getQuality() + 1);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getSellIn() <= 10 && item.getSellIn() > 5) {
            item.setQuality(item.getQuality() + 2);
            item.setSellIn(item.getSellIn() - 1);
        } else if (item.getSellIn() <= 5 && item.getSellIn() > 0) {
            item.setQuality(item.getQuality() + 3);
            item.setSellIn(item.getSellIn() - 1);
        } else {
            item.setQuality(0);
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
