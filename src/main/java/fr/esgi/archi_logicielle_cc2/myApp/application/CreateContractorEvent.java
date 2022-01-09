package fr.esgi.archi_logicielle_cc2.myApp.application;

import fr.esgi.archi_logicielle_cc2.kernel.ApplicationEvent;
import fr.esgi.archi_logicielle_cc2.myApp.domain.UserId;

public class CreateContractorEvent implements ApplicationEvent {
    private final UserId userId;

    public CreateContractorEvent(UserId userId) {
        this.userId = userId;
    }
}