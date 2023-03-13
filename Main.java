import Controller.Controller;
import Model.ToyShopOperation;
import View.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ToyShopOperation toyShopOperation = new ToyShopOperation();
        Controller controller = new Controller(view, toyShopOperation);        
        view.setController(controller);
        view.start();
    }
}