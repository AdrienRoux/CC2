package fr.esgi.archi_logicielle_cc2.infrastructure;

import fr.esgi.archi_logicielle_cc2.domain.models.Membership;

public interface MembershipRepository {
    void add(Membership membership);
}
