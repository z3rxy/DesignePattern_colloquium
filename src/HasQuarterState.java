public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Поверните ручку аппарата для получения жевачки.");
    }

    public void insertQuarter() {
        System.out.println("Четвертак уже был вставлен.");
    }

    public void ejectQuarter() {
        System.out.println("Вы вставили четвертак.");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Ручка была повернута, нажмите на экран для выдачи жевачки.");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }
}
