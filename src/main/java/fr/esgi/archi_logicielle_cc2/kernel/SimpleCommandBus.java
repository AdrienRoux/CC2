package fr.esgi.archi_logicielle_cc2.kernel;

import java.util.Map;

public class SimpleCommandBus implements CommandBus {
    private final Map<Class<? extends Command>, CommandHandler> dataMap;

    public SimpleCommandBus(Map<Class<? extends Command>, CommandHandler> dataMap) {
        this.dataMap = dataMap;
    }

    @Override
    public <C extends Command, R> R send(C command) {
        return dispatch(command);
    }

    private <C extends Command, R> R dispatch(C command) {
        final CommandHandler commandHandler = dataMap.get(command.getClass());
        if (commandHandler == null) {
            throw new RuntimeException("No such command handler for " + command.getClass().getName());
        }

        return (R) commandHandler.handle(command);
    }
}