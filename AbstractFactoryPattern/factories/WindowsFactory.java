package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.products.Button;
import AbstractFactoryPattern.products.CheckBox;
import AbstractFactoryPattern.products.WindowsButton;
import AbstractFactoryPattern.products.WindowsCheckBox;

public class WindowsFactory  implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
    
}
