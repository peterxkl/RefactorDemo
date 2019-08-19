package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")){
                if (items[i].getSellIn() < 1) {
                    items[i].quality = Math.min(items[i].quality + 2, 50);
                } else {
                    items[i].quality = Math.min(items[i].quality + 1, 50);
                }
                items[i].sellIn--;
            }else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                items[i].sellIn--;
                if (items[i].sellIn < 0) {
                    items[i].quality = 0;
                    return;
                }
                if (items[i].sellIn < 5) {
                    items[i].quality = Math.min(items[i].quality + 3, 50);
                    return;
                }
                if (items[i].sellIn < 10) {
                    items[i].quality = Math.min(items[i].quality + 2, 50);
                    return;
                }
                items[i].quality = Math.min(items[i].quality + 1, 50);
            }else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")){

            }else {
                if (items[i].sellIn < 1) {
                    items[i].quality = Math.max(items[i].quality - 2, 0);
                }else{
                    items[i].quality = Math.max(items[i].quality - 1, 0);
                }
                items[i].sellIn--;
            }
        }
    }
}