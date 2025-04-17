package com.github.pseudodiscounts.api.user.model;

import java.util.List;

public record UserAccount(
        String username,
        String passwordHash,
        boolean isAccountNonExpired,
        boolean isAccountNonLocked,
        boolean isCredentialsNonExpired,
        boolean isEnabled,
        List<Role> roles
) {
}
