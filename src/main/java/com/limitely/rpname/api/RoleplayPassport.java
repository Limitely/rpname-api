package com.limitely.rpname.api;

import java.util.UUID;

public record RoleplayPassport(
        UUID uuid,
        String name,
        String surname,
        String fullName,
        int age,
        String gender,
        String registerDate,
        String faction,
        String rank
) {
}
