package fr.esgi.archi_logicielle_cc2.myApp.application;

import fr.esgi.archi_logicielle_cc2.kernel.EventListener;

public class CreateContractorEventListener implements EventListener<CreateContractorEvent> {
    @Override
    public void listenTo(CreateContractorEvent event) {
        System.out.println("listening CreateUserEvent.");
    }
}
