package gildedRose;


import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_10_and_27_when_name_is_Aged_Brie_and_sellin_is_11_and_quality_is_26(){
        //given
        Item item = new Item("Aged Brie",11,26);
        Item[] items = new Item[]{item};

        //when
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        //then
        assertEquals(10,items[0].sellIn);
        assertEquals(27,items[0].quality);
    }

    @Test
    public void should_return_4_and_31_when_name_is_Aged_Brie_and_sellin_is_1_and_quality_is_30(){
        Item item = new Item("Aged Brie",1,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,items[0].sellIn);
        assertEquals(31,items[0].quality);
    }

    @Test
    public void should_return_negative_7_and_0_when_name_is_Aged_Brie_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Aged Brie",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(32,items[0].quality);
    }

    @Test
    public void should_return_19_and_31_when_name_is_Backstage_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(19,items[0].sellIn);
        assertEquals(31,items[0].quality);
    }

    @Test
    public void should_return_9_and_32_when_name_is_Backstage_sellin_is_10_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9,items[0].sellIn);
        assertEquals(32,items[0].quality);
    }

    @Test
    public void should_return_6_and_32_when_name_is_Backstage_and_sellin_is_7_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(6,items[0].sellIn);
        assertEquals(32,items[0].quality);
    }

    @Test
    public void should_return_4_and_33_when_name_is_Backstage_and_sellin_is_5_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(33,items[0].quality);
    }

    @Test
    public void should_return_4_and_0_when_name_is_Backstage_and_sellin_is_0_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,items[0].sellIn);
        assertEquals(0,items[0].quality);
    }

    @Test
    public void should_return_negative_7_and_0_when_name_is_Backstage_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(0,items[0].quality);
    }

    @Test
    public void should_return_20_and_30_when_name_is_Sulfuras_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(20,items[0].sellIn);
        assertEquals(30,items[0].quality);
    }

    @Test
    public void should_return_negative_6_and_0_when_name_is_Sulfuras_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-6,items[0].sellIn);
        assertEquals(30,items[0].quality);
    }

    @Test
    public void should_return_10_and_25_when_sellin_is_11_and_quality_is_26(){
        Item item = new Item("Dillon",11,26);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(10,items[0].sellIn);
        assertEquals(25,items[0].quality);
    }

    @Test
    public void should_return_negative_6_and_0_when_name_is_Emilio_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("dillon",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(28,items[0].quality);
    }
}
