package com.github.pseudodiscounts.api.marketplace.model;

import java.net.URL;

public record Product(
        long id,
        String name,
        Media picture,
        URL url,
        boolean isAdultOnly,
        PriceHistory priceHistory
) {
}
