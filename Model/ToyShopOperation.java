package Model;

import java.io.Serializable;

public class ToyShopOperation implements Serializable {
    private ToyShop toyShop;

    FileWorker fileWorkerToyShop;

    public ToyShopOperation() {
        this.toyShop = new ToyShop();
        this.fileWorkerToyShop = new FileWorker();
        Toy toy1 = new Toy(001, "Cat", 5, 80);
        Toy toy2 = new Toy(002, "Dog", 9, 50);
        Toy toy3 = new Toy(003, "Elefant", 35, 10);
        Toy toy4 = new Toy(004, "Mickey Mouse", 11, 40);
        Toy toy5 = new Toy(005, "Rabbit", 19, 20);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);
        toyShop.addToy(toy4);
        toyShop.addToy(toy5);
    }

    public void printConsoleToyShop() {
        int i = 1;
        for (Toy toy : toyShop) {
            System.out.println(i + ". " + toy);
            i++;
        }
    }

    public void printConsoleToyDrawn() {
        System.out.println(toyShop.getToyDrawn());
    }

    // метод реализации розыгрыша случайной игрушки
    public void drawingToy() {
        double chance = 0;
        double chanceMax = 0;
        int idMax = 0;
        for (Toy toyOneIt : toyShop) {
            chance = toyOneIt.getAmount() * toyOneIt.getChance();
            if (chanceMax < chance) {
                chanceMax = chance;
                idMax = toyOneIt.getId();
            }
        }
        for (Toy toy : toyShop) {
            if (toy.getId() == idMax) {
                System.out.println(toy.toStringOffAmount());
                if (toy.getAmount() > 1) {
                    toy.setAmount(toy.getAmount() - 1);
                } else if (toy.getAmount() == 1) {
                    toyShop.removeToy(toy);
                }
                toyShop.addToyDrawn(toy);
            }
        }
    }

    // метод реализации получения призовой игрушки
    public void issuedToy() {        
        for (Toy toy : toyShop.getToyDrawn()) {            
            System.out.println(toy.toStringOffAmount());
            if (toy.getAmount() > 1) {
                toy.setAmount(toy.getAmount() - 1);
            } else if (toy.getAmount() == 1) {
                toyShop.removeDrawnToy(toy);
            }
            toyShop.addIssuedToy(toy);
            printFile();
            break;            
        }
    }

    public void printConsoleIssuedToy() {
        System.out.println(toyShop.getIssuedToy());
    }

    public void printFile() {
        fileWorkerToyShop.write(toyShop.getIssuedToy(), "issuedToy.txt");
    }
}
