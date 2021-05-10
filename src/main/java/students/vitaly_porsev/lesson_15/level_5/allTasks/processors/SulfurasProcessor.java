package students.vitaly_porsev.lesson_15.level_5.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemNameChecker;
import students.vitaly_porsev.lesson_15.level_5.allTasks.ItemProcessor;

public class SulfurasProcessor implements ItemProcessor {

    private final ItemNameChecker checker;

    public SulfurasProcessor(ItemNameChecker checker) {
        this.checker = checker;
    }

    @Override
    public boolean canProcess(Item item) {
        return checker.checkItemName(item.getName(), "sulfuras");
    }

    @Override
    public void process(Item item) {
        item.setQuality(80);
        item.setSellIn(0);
    }
}
