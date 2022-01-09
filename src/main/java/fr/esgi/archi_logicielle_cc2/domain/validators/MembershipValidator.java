package fr.esgi.archi_logicielle_cc2.domain.validators;

import fr.esgi.archi_logicielle_cc2.domain.models.MembershipApplication;
import fr.esgi.archi_logicielle_cc2.infrastructure.Logger;

public class MembershipValidator implements Predicate<MembershipApplication> {
    private final Logger logger;

    public MembershipValidator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean validate(MembershipApplication entity) {
        if (entity.age > 18) {
            logger.log("Valid Member");
        } else {
            logger.log("Invalid Member");
        }
        return entity.age > 18;
    }
}
