package AbstractFactoryPattern.products;

public class MacCheckBox implements CheckBox {
    
    @Override
    public void createCheckBox(){
        System.out.println("Mac check box created");
    }
    
}
