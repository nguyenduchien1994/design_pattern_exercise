package Item;

import Interface.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Item.Bottle";
    }
}