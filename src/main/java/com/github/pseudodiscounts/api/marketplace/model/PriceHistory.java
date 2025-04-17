package com.github.pseudodiscounts.api.marketplace.model;

import java.util.List;

public record PriceHistory(
        List<PriceHistoryEntry> entryList
) {
}
