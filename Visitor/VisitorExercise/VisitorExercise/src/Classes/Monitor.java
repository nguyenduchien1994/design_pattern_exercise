package Classes;

import Interfaces.ComputerPart;
import Interfaces.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}