public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Поверните ручку аппарата для получения жевачки.");
    }

    public void insertQuarter() {
        System.out.println("Вы вставили четвертак.");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Вы должны вставить четвертак, чтобы получить жевачку.");
    }

    public void turnCrank() {
        System.out.println("Вы должны вставить четвертак, чтобы иметь возможность повернуть ручку.");
    }
}
