package com.github.pseudodiscounts.api.user.model;

import java.time.LocalDate;

public record User(
        long id,
        String name,
        LocalDate birthDate,
        UserAccount account
) {
}
