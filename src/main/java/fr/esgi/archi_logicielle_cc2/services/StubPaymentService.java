package fr.esgi.archi_logicielle_cc2.services;

import fr.esgi.archi_logicielle_cc2.infrastructure.Logger;

public class StubPaymentService implements PaymentService {
    private final Logger logger;

    public StubPaymentService(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean process() {
        logger.log("Payment processed !");
        return true;
    }
}
