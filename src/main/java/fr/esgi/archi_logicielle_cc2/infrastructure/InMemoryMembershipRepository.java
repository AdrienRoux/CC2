package fr.esgi.archi_logicielle_cc2.infrastructure;

import fr.esgi.archi_logicielle_cc2.domain.models.Membership;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMembershipRepository implements MembershipRepository {
    private final List<Membership> memberships;

    public InMemoryMembershipRepository() {
        this.memberships = new ArrayList<>();
    }

    @Override
    public void add(Membership membership) {
        memberships.add(membership);
    }
}
