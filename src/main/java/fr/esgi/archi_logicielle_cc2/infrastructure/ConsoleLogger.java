package fr.esgi.archi_logicielle_cc2.infrastructure;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
