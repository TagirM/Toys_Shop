package View.Command;

import View.View;

public class PrintConsoleToyDrawn  implements Option{
    View view;
    public PrintConsoleToyDrawn(View view) {
        this.view = view;
    }

    public String discription() {
        return "Print in console all drawn toy.";
    }

    public void execute() {        
        view.printConsoleToyDrawn();
    }    
}
