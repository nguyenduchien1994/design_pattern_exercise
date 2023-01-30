package Classes;

import Interfaces.ComputerPart;
import Interfaces.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    /**
     * Constructor. Initiate our Computer with ComputerPart objects,
     * including a mouse, a keyboard and a monitor.
     */
    public Computer(){
        // Add code here
    }

    /**
     * Allow computerPartVisitor to visit each ComputerPart, including the Computer itself.
     * @param computerPartVisitor The visitor object
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // Add code here
    }
}
