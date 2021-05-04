package students.vitaly_porsev.lesson_15.level_5_tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_15.level_5.allTasks.GildedRose;
import students.vitaly_porsev.lesson_15.level_5.allTasks.Item;

import java.util.ArrayList;

import java.util.List;

public class GildedRoseTests {

    @Test
    void normal_item_regular_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("+5 Dexterity Vest");
            Assertions.assertThat(item.getSellIn()).isEqualTo(7);
            Assertions.assertThat(item.getQuality()).isEqualTo(17);
        });
    }

    @Test
    void normal_item_overdue() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 0, 4));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("+5 Dexterity Vest");
            Assertions.assertThat(item.getSellIn()).isEqualTo(-3);
            Assertions.assertThat(item.getQuality()).isEqualTo(0);
        });
    }

    @Test
    void aged_brie_regular_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 10, 20));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Aged Brie");
            Assertions.assertThat(item.getSellIn()).isEqualTo(7);
            Assertions.assertThat(item.getQuality()).isEqualTo(23);
        });
    }

    @Test
    void aged_brie_quality_cap() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 11, 48));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Aged Brie");
            Assertions.assertThat(item.getSellIn()).isEqualTo(8);
            Assertions.assertThat(item.getQuality()).isEqualTo(50);
        });
    }

    @Test
    void sulfuras_regular_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Sulfuras, Hand of Ragnaros");
            Assertions.assertThat(item.getSellIn()).isEqualTo(0);
            Assertions.assertThat(item.getQuality()).isEqualTo(80);
        });
    }

    @Test
    void backstage_pass_more_than_10_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 13, 10));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Backstage passes to a TAFKAL80ETC concert");
            Assertions.assertThat(item.getSellIn()).isEqualTo(10);
            Assertions.assertThat(item.getQuality()).isEqualTo(13);
        });
    }

    @Test
    void backstage_pass_less_than_10_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Backstage passes to a TAFKAL80ETC concert");
            Assertions.assertThat(item.getSellIn()).isEqualTo(7);
            Assertions.assertThat(item.getQuality()).isEqualTo(16);
        });
    }

    @Test
    void backstage_pass_less_than_5_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Backstage passes to a TAFKAL80ETC concert");
            Assertions.assertThat(item.getSellIn()).isEqualTo(2);
            Assertions.assertThat(item.getQuality()).isEqualTo(19);
        });
    }

    @Test
    void backstage_pass_overdue() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Backstage passes to a TAFKAL80ETC concert");
            Assertions.assertThat(item.getSellIn()).isEqualTo(-1);
            Assertions.assertThat(item.getQuality()).isEqualTo(0);
        });
    }

    @Test
    void conjured_item_regular_day() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Conjured Mana Cake", 10, 20));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Conjured Mana Cake");
            Assertions.assertThat(item.getSellIn()).isEqualTo(7);
            Assertions.assertThat(item.getQuality()).isEqualTo(14);
        });
    }

    @Test
    void conjured_item_overdue() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Conjured Mana Cake", 1, 6));
        GildedRose subject = new GildedRose();

        subject.updateQuality(items);
        subject.updateQuality(items);
        subject.updateQuality(items);

        Assertions.assertThat(items.get(0)).satisfies(item ->
        {
            Assertions.assertThat(item.getName()).isEqualTo("Conjured Mana Cake");
            Assertions.assertThat(item.getSellIn()).isEqualTo(-2);
            Assertions.assertThat(item.getQuality()).isEqualTo(0);
        });
    }
}
