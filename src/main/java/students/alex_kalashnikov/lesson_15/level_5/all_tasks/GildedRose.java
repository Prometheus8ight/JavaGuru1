package students.alex_kalashnikov.lesson_15.level_5.all_tasks;

import java.util.List;

class GildedRose {

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            switch (item.getName()) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePasses(item);
                    break;
                case "Conjured Mana Cake":
                    updateConjuredItem(item);
                    break;
                default:
                    updateOrdinaryItem(item);
                    break;
            }
        }
    }

    private void updateOrdinaryItem(Item item) {
        if (item.getSellIn() > -1) {
            item.setQuality(item.getQuality() - 1);
        } else if (item.getQuality() > 1) {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(0);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateAgedBrie(Item item) {
        if (item.getQuality() < 50 && item.getSellIn() > 0) {
            item.setQuality(item.getQuality() + 1);
        } else if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 2);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateBackstagePasses(Item item) {
        if (item.getQuality() < 50 && item.getSellIn() < 6 && item.getSellIn() > -1) {
            item.setQuality(item.getQuality() + 3);
        } else if (item.getQuality() < 50 && item.getSellIn() < 11 && item.getSellIn() > -1) {
            item.setQuality(item.getQuality() + 2);
        } else if (item.getQuality() < 50 && item.getSellIn() > -1) {
            item.setQuality(item.getQuality() + 1);
        } else {
            item.setQuality(0);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateConjuredItem(Item item) {
        if (item.getSellIn() > -1) {
            item.setQuality(item.getQuality() - 2);
        } else if (item.getQuality() > 1) {
            item.setQuality(item.getQuality() - 4);
        } else {
            item.setQuality(0);
        }
        item.setSellIn(item.getSellIn() - 1);
    }

}