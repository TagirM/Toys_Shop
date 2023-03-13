package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import View.Command.DrawingToy;
import View.Command.IssuedToy;
import View.Command.Option;
import View.Command.PrintConsoleToyDrawn;
import View.Command.PrintConsoleToyShop;
import View.Command.PrintIssuedToy;
import View.Command.StopApplication;

public class View {
    private Scanner scanner;
    Controller controller;
    public boolean application;
        
    public View() {
        scanner = new Scanner(System.in);
    }

    // взаимодействие с пользователем в консоле
    public void action(List<Option> commandList) {
        this.application = true;
        while (this.application != false){
            System.out.println("Choose number of action:");
        
            for (int index = 0; index < commandList.size(); index++) {
                System.out.println((index + 1) + ". " + commandList.get(index).discription());
            }
            System.out.print("You choose number: ");            
            int chooseCommand = scanner.nextInt();
            System.out.println();
            System.out.println("Result:");    
            if (chooseCommand <= commandList.size()) {
                commandList.get(chooseCommand - 1).execute();
                System.out.println();
            }   
            else{
                System.out.println("Select uncorrect number of action.");
                action(commandList);
            }
        }                  
    }    

    public void start() {
        List<Option> commandList = new ArrayList<Option>(); // список команд в меню в консоле
        commandList.add(new PrintConsoleToyShop(this));
        commandList.add(new PrintConsoleToyDrawn(this));
        commandList.add(new DrawingToy(this));
        commandList.add(new IssuedToy(this));
        commandList.add(new PrintIssuedToy(this));
        commandList.add(new StopApplication(this));
        action(commandList);
    }

    public void printConsoleToyShop() {
        controller.printConsoleToyShop();
    }

    public void printConsoleToyDrawn() {
        controller.printConsoleToyDrawn();
    }

    public void drawingToy() {
        controller.drawingToy();
    }

    public void issuedToy() {
        controller.issuedToy();
    }

    public void printConsoleIssuedToy() {
        controller.printConsoleIssuedToy();
    }

    public void stopApplication() {
        System.out.println("Thanks for the work! Goodbay!");
        scanner.close();
        this.application = false;       
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
