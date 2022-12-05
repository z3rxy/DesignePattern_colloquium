public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Аппарат пуст, нет жевачек для покупки.");
    }

    public void insertQuarter() {
        System.out.println("Нет жевачек для покупки.");
    }

    public void ejectQuarter() {
        System.out.println("Нет жевачек для покупки, нет четвертаков, чтобы выдать.");
    }

    public void turnCrank() {
        System.out.println("Нет жевачек, не пытайтесь повренуть ручку.");
    }
}
