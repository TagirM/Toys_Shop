package View.Command;

import View.View;

public class StopApplication implements Option{
    View view;
    public StopApplication(View view) {
        this.view = view;
    }

    public String discription() {
        return "Exit from application.";
    }

    public void execute() {        
        view.stopApplication();        
    }    
}
