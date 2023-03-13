package View.Command;

import View.View;

public class PrintIssuedToy implements Option{
    View view;
    public PrintIssuedToy(View view) {
        this.view = view;
    }

    public String discription() {
        return "Print in console all issued toy.";
    }

    public void execute() {        
        view.printConsoleIssuedToy();
    }    
}
