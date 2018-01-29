package com.shangxiazuoyou.localechangerkit;

import java.util.Locale;

/**
 * A class representing a pair of Locales resolved by the {@link LocaleResolver#resolveDefault()}
 */
class DefaultResolvedLocalePair {
    private Locale supportedLocale;
    private Locale resolvedLocale;

    DefaultResolvedLocalePair(Locale supportedLocale, Locale resolvedLocale) {
        this.supportedLocale = supportedLocale;
        this.resolvedLocale = resolvedLocale;
    }

    Locale getSupportedLocale() {
        return supportedLocale;
    }

    Locale getResolvedLocale() {
        return resolvedLocale;
    }
}
