package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.products.Button;
import AbstractFactoryPattern.products.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
