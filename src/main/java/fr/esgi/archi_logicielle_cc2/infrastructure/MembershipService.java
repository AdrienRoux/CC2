package fr.esgi.archi_logicielle_cc2.infrastructure;

import fr.esgi.archi_logicielle_cc2.domain.models.Membership;
import fr.esgi.archi_logicielle_cc2.domain.models.MembershipApplication;
import fr.esgi.archi_logicielle_cc2.domain.validators.Predicate;
import fr.esgi.archi_logicielle_cc2.services.PaymentService;

public class MembershipService {
    private final MembershipRepository repository;
    private final PaymentService paymentService;
    private final Predicate<MembershipApplication> membershipApplicationPredicate;

    public MembershipService(MembershipRepository repository, PaymentService paymentService, Predicate<MembershipApplication> membershipApplicationPredicate) {
        this.repository = repository;
        this.paymentService = paymentService;
        this.membershipApplicationPredicate = membershipApplicationPredicate;
    }

    public void add(MembershipApplication application) {
        if (membershipApplicationPredicate.validate(application) && paymentService.process()) {
            repository.add(new Membership(application.name, application.firstname, application.age));
        }
    }
}
