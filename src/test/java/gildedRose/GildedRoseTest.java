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


}
