package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")){
                updateQualityOnAged(items[i]);
            }else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                if (updateQualityOnBackstage(i)) return;
            }else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")){

            }else {
                updateQualityOnOthers(items[i]);
            }
        }
    }

    private void updateQualityOnOthers(Item item) {
        if (item.sellIn < 1) {
            item.quality = Math.max(item.quality - 2, 0);
        }else{
            item.quality = Math.max(item.quality - 1, 0);
        }
        item.sellIn--;
    }

    private boolean updateQualityOnBackstage(int i) {
        items[i].sellIn--;
        if (items[i].sellIn < 0) {
            items[i].quality = 0;
            return true;
        }
        if (items[i].sellIn < 5) {
            items[i].quality = Math.min(items[i].quality + 3, 50);
            return true;
        }
        if (items[i].sellIn < 10) {
            items[i].quality = Math.min(items[i].quality + 2, 50);
            return true;
        }
        items[i].quality = Math.min(items[i].quality + 1, 50);
        return false;
    }

    private void updateQualityOnAged(Item item) {
        if (item.getSellIn() < 1) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
        item.sellIn--;
    }
}