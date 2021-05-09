package students.alex_kalashnikov.lesson_15.level_5.all_tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    GildedRose gildedRose = new GildedRose();

    private List<Item> createArr() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 20));
        return items;
    }

    private String updateForNumberOfDays(int days, int item) {
        List<Item> arr = createArr();
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality(arr);
        }
        return arr.get(item).getName() + "," +
                arr.get(item).getSellIn() + "," + arr.get(item).getQuality();
    }

    @Test
    void testItemAfter1Day() {
        assertEquals(new String("+5 Dexterity Vest,9,19"),
                updateForNumberOfDays(1, 0));
    }

    @Test
    void testItemAfter10Day() {
        assertEquals(new String("+5 Dexterity Vest,0,10"),
                updateForNumberOfDays(10, 0));
    }

    @Test
    void testItemAfter30Day() {
        assertEquals(new String("+5 Dexterity Vest,-20,0"),
                updateForNumberOfDays(30, 0));
    }

    @Test
    void testAgedBrieAfter1Day() {
        assertEquals(new String("Aged Brie,1,1"),
                updateForNumberOfDays(1, 1));
    }

    @Test
    void testAgedBrieAfter7Days() {
        assertEquals(new String("Aged Brie,-5,12"),
                updateForNumberOfDays(7, 1));
    }

    @Test
    void testAgedBrieAfter30Days() {
        assertEquals(new String("Aged Brie,-28,50"),
                updateForNumberOfDays(30, 1));
    }

    @Test
    void testSulfurasAfter1Day() {
        assertEquals(new String("Sulfuras, Hand of Ragnaros,0,80"),
                updateForNumberOfDays(1, 3));
    }

    @Test
    void testSulfurasAfter30Days() {
        assertEquals(new String("Sulfuras, Hand of Ragnaros,0,80"),
                updateForNumberOfDays(30, 3));
    }

    @Test
    void testBackstagePassesAfter1Day() {
        assertEquals(new String("Backstage passes to a TAFKAL80ETC concert,14,21"),
                updateForNumberOfDays(1, 4));
    }

    @Test
    void testBackstagePassesAfter7Days() {
        assertEquals(new String("Backstage passes to a TAFKAL80ETC concert,8,29"),
                updateForNumberOfDays(7, 4));
    }

    @Test
    void testBackstagePassesAfter12Days() {
        assertEquals(new String("Backstage passes to a TAFKAL80ETC concert,3,41"),
                updateForNumberOfDays(12, 4));
    }

    @Test
    void testBackstagePassesAfter20Days() {
        assertEquals(new String("Backstage passes to a TAFKAL80ETC concert,-5,0"),
                updateForNumberOfDays(20, 4));
    }

    @Test
    void testConjuredItemsAfter1Day() {
        assertEquals(new String("Conjured Mana Cake,2,18"),
                updateForNumberOfDays(1, 5));
    }

    @Test
    void testConjuredItemsAfter3Days() {
        assertEquals(new String("Conjured Mana Cake,0,14"),
                updateForNumberOfDays(3, 5));
    }

    @Test
    void testConjuredItemsAfter5Days() {
        assertEquals(new String("Conjured Mana Cake,-2,8"),
                updateForNumberOfDays(5, 5));
    }

    @Test
    void testConjuredItemsAfter10Days() {
        assertEquals(new String("Conjured Mana Cake,-7,0"),
                updateForNumberOfDays(10, 5));
    }

}