package Item;

import Interface.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Item.Wrapper";
    }
}