package Controller;

import Model.ToyShopOperation;
import View.View;

public class Controller {    
    View view;
    ToyShopOperation toyShopOperation;

    public Controller(View view, ToyShopOperation toyShopOperation) {
        this.view = view;
        this.toyShopOperation = toyShopOperation;
    }

    public void printConsoleToyShop() {
        toyShopOperation.printConsoleToyShop();
    }

    public void printConsoleToyDrawn() {
        toyShopOperation.printConsoleToyDrawn();
    }
    public void drawingToy() {
        toyShopOperation.drawingToy();
    }

    public void issuedToy() {
        toyShopOperation.issuedToy();
    }
    
    public void printConsoleIssuedToy() { 
        toyShopOperation.printConsoleIssuedToy();      
    }
}
