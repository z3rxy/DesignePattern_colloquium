public class GumballMachineSimulation {
    public static void main(String[] args) {
        System.out.println("Например машина с двумя жевачками");
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("\nGetting one gumball");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("\nА после вставления четвертака не хотим жевачку больше");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        System.out.println("\nПытаемся повернуть ручку не вставив четвертак");
        gumballMachine.turnCrank();
        gumballMachine.dispense();


        System.out.println("\nДважды вставляем четвертак");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        System.out.println("\nПолучаем еще одну жевачку");
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("\nПытаемся получить жевачку из пустой машины");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
    }
}
