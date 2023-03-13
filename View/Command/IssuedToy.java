package View.Command;

import View.View;

public class IssuedToy implements Option{
    View view;
    public IssuedToy(View view) {
        this.view = view;
    }

    public String discription() {
        return "Get drawn toy.";
    }

    public void execute() {        
        view.issuedToy();
    }    
}
