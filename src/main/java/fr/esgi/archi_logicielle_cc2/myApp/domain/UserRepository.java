package fr.esgi.archi_logicielle_cc2.myApp.domain;

import java.util.UUID;

public interface UserRepository {

    void save(Membership membership);

    Membership byId(UserId userId);

    default UserId nextId() {
        return UserId.fromUUID(UUID.randomUUID());
    }

}
