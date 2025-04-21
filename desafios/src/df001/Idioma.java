package df001;

import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Linguagem:" + locale.getDisplayLanguage() + " br");
    }
}
