package AbstractFactoryPattern.factories;

import AbstractFactoryPattern.products.Button;
import AbstractFactoryPattern.products.CheckBox;
import AbstractFactoryPattern.products.MacButton;
import AbstractFactoryPattern.products.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
      return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
       return new MacCheckBox();
    }
    
}
