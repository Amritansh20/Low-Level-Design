package AbstractFactoryPattern;

import AbstractFactoryPattern.factories.GUIFactory;
import AbstractFactoryPattern.products.Button;
import AbstractFactoryPattern.products.CheckBox;

public class Main {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        GUIFactory factory = factoryProvider.getFactory("Windows");

        Button button = factory.createButton();
        CheckBox checkBox= factory.createCheckBox();

        button.createButton();
        checkBox.createCheckBox();
    }
    
}
