package Abstracts;

import Interfaces.Item;
import Interfaces.Packing;
import Classes.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
