import Classes.Computer;
import Classes.ComputerPartDisplayVisitor;
import Interfaces.ComputerPart;

public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}