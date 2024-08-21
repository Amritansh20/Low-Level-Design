package AbstractFactoryPattern.products;

public class WindowsCheckBox implements CheckBox {
    
    @Override
    public void createCheckBox(){
        System.out.println("Windows check box created");
    }
}
