package fr.esgi.archi_logicielle_cc2.kernel;

public interface EventListener<E extends Event> {
    void listenTo(E event);
}


