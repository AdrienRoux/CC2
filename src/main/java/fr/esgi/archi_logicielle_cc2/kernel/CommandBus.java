package fr.esgi.archi_logicielle_cc2.kernel;

public interface CommandBus {
    <C extends Command, R> R send(C command);
}