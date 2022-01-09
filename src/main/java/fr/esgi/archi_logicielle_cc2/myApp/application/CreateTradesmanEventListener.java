package fr.esgi.archi_logicielle_cc2.myApp.application;

import fr.esgi.archi_logicielle_cc2.kernel.EventListener;

public class CreateTradesmanEventListener implements EventListener<CreateTradesmanEvent> {
    @Override
    public void listenTo(CreateTradesmanEvent event) {
        System.out.println("listening CreateUserEvent.");
    }
}
