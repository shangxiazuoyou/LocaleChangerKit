package com.shangxiazuoyou.localechangerkit.matcher;

import com.shangxiazuoyou.localechangerkit.LocalePreference;

import java.util.Locale;

/**
 * This class represents a pair of matching locales between a supported and a system Locale.
 */
public final class MatchingLocales {
    private Locale supportedLocale;
    private Locale systemLocale;

    public MatchingLocales(Locale supportedLocale, Locale systemLocale) {
        this.supportedLocale = supportedLocale;
        this.systemLocale = systemLocale;
    }

    public Locale getSupportedLocale() {
        return supportedLocale;
    }

    public Locale getSystemLocale() {
        return systemLocale;
    }

    public Locale getPreferredLocale(LocalePreference preference) {
        return preference.equals(LocalePreference.PreferSupportedLocale) ?
                supportedLocale :
                systemLocale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchingLocales that = (MatchingLocales) o;

        return supportedLocale.equals(that.supportedLocale)
                && systemLocale.equals(that.systemLocale);
    }

    @Override
    public int hashCode() {
        int result = supportedLocale.hashCode();
        result = 31 * result + systemLocale.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return supportedLocale.toString() + ", " + systemLocale.toString();
    }
}
