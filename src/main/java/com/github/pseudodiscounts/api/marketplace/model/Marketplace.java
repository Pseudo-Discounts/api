package com.github.pseudodiscounts.api.marketplace.model;

import java.net.URL;

public record Marketplace(
        long id,
        String name,
        Media logo,
        URL url
) {
}
