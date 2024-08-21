package AbstractFactoryPattern;

import AbstractFactoryPattern.factories.GUIFactory;
import AbstractFactoryPattern.factories.MacFactory;
import AbstractFactoryPattern.factories.WindowsFactory;

public class FactoryProvider {
    public GUIFactory getFactory(String osName){
        if(osName.equalsIgnoreCase("Windows"))
        return new WindowsFactory();
        else
        return new MacFactory();
    }
}
