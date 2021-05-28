package chapter6;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle.getBundle("./mess", aDefault);
        System.out.println(bundle.getString("hello"));
    }
}
