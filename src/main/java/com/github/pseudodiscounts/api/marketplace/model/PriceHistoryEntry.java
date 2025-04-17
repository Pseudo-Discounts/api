package com.github.pseudodiscounts.api.marketplace.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record PriceHistoryEntry(
        long id,
        BigDecimal price,
        ZonedDateTime timestamp
) {
}
