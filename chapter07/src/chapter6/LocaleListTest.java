package chapter6;

import java.util.Locale;

public class LocaleListTest {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            System.out.println(locales[i].getDisplayCountry() +
                    "=" + locales[i].getCountry() +
                    "=" + locales[i].getDisplayLanguage() +
                    "=" + locales[i].getLanguage());
        }
    }
}