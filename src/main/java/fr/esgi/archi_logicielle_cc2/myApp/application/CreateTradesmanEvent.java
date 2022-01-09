package fr.esgi.archi_logicielle_cc2.myApp.application;

import fr.esgi.archi_logicielle_cc2.kernel.ApplicationEvent;
import fr.esgi.archi_logicielle_cc2.myApp.domain.UserId;

public class CreateTradesmanEvent implements ApplicationEvent {
    private final UserId userId;

    public CreateTradesmanEvent(UserId userId) {
        this.userId = userId;
    }
}
