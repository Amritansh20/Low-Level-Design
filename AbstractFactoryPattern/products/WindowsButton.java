package AbstractFactoryPattern.products;

public class WindowsButton implements Button{
    
    @Override
    public void createButton(){
        System.out.println("Windows button created");
    }
}
