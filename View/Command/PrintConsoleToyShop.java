package View.Command;

import View.View;

public class PrintConsoleToyShop  implements Option{
    View view;
    public PrintConsoleToyShop(View view) {
        this.view = view;
    }

    public String discription() {
        return "Print in console all toy from shop.";
    }

    public void execute() {        
        view.printConsoleToyShop();
    }    
}
