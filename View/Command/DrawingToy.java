package View.Command;

import View.View;

public class DrawingToy implements Option{

    View view;
    public DrawingToy(View view) {
        this.view = view;
    }

    public String discription() {
        return "Play toys now";
    }

    public void execute() {        
        view.drawingToy();
    }    
    
}
