package students.vitaly_porsev.lesson_15.level_5.allTasks;

import students.vitaly_porsev.lesson_15.level_5.allTasks.processors.*;

import java.util.List;

public class GildedRose {

    public void updateQuality(List<Item> items) {
        ItemProcessor[] itemProcessor = {new NormalItemProcessor(), new AgedBrieProcessor(),
                new BackStagePassProcessor(), new SulfurasProcessor(), new ConjuredProcessor()};

        for (Item item : items) {
            for (ItemProcessor processor : itemProcessor) {
                if (processor.canProcess(item)) {
                    processor.process(item);
                }
            }
        }
    }
}