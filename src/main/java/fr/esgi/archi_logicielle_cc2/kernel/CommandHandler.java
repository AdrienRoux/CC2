package fr.esgi.archi_logicielle_cc2.kernel;

public interface CommandHandler<C extends Command, R> {
    R handle(C command);
}