package Abstracts;

import Interfaces.Item;
import Interfaces.Packing;
import Classes.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
