package fr.esgi.archi_logicielle_cc2;

import fr.esgi.archi_logicielle_cc2.domain.models.MembershipApplication;
import fr.esgi.archi_logicielle_cc2.domain.validators.MembershipValidator;
import fr.esgi.archi_logicielle_cc2.infrastructure.ConsoleLogger;
import fr.esgi.archi_logicielle_cc2.infrastructure.InMemoryMembershipRepository;
import fr.esgi.archi_logicielle_cc2.infrastructure.MembershipController;
import fr.esgi.archi_logicielle_cc2.infrastructure.MembershipService;
import fr.esgi.archi_logicielle_cc2.services.StubPaymentService;

public class Main {
    public static void main(String[] args) {
        var logger = new ConsoleLogger();
        var membershipRepo = new InMemoryMembershipRepository();
        var membershipValidator = new MembershipValidator(logger);
        var stubPaymentService = new StubPaymentService(logger);

        var membershipService = new MembershipService(membershipRepo, stubPaymentService, membershipValidator);
        var membershipController = new MembershipController(membershipService);

        var membershipApplication = new MembershipApplication();

        membershipApplication.name = "Test";
        membershipApplication.firstname = "Test";
        membershipApplication.age = 18;

        var membershipApplication2 = new MembershipApplication();

        membershipApplication2.name = "Test";
        membershipApplication2.firstname = "Test";
        membershipApplication2.age = 19;

        membershipController.add(membershipApplication);
        membershipController.add(membershipApplication2);
    }
}
