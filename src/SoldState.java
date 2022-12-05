public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Жевачка уже в пути!");
        gumballMachine.releaseGumball();
        if (gumballMachine.getCountOfGumballs() == 0) {
            System.out.println("Все жевачки распроданы.");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        }
    }

    public void insertQuarter() {
        System.out.println("Четвертак уже был вставлен.");
    }

    public void ejectQuarter() {
        System.out.println("Нельзя вставить четвертак после поворота ручки.");
    }

    public void turnCrank() {
        System.out.println("Нельзя повернуть ручку без получения жевачки.");
    }
}
