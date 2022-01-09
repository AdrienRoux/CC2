package fr.esgi.archi_logicielle_cc2.infrastructure;

import fr.esgi.archi_logicielle_cc2.domain.models.MembershipApplication;

public class MembershipController {
    private final MembershipService service;

    public MembershipController(MembershipService service) {
        this.service = service;
    }

    public void add(MembershipApplication membershipApplication) {
        service.add(membershipApplication);
    }
}
