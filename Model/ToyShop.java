package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToyShop implements Iterable<Toy>, Serializable {
    private List<Toy> toyList; // набор всех игрушек в магазине
    private List<Toy> toyDrawnList = new ArrayList<>(); // список призовых игрушек, которые ожидают выдачи
    private List<Toy> toyIssuedList = new ArrayList<>(); // полученные призовые игрушки

    public ToyShop(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public ToyShop() {
        this(new ArrayList<>());
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    public void removeToy(Toy toy) {
        toyList.remove(toy);
    }

    public void removeDrawnToy(Toy toy) {
        toyDrawnList.remove(toy);
    }

    // добавление в список призовых игрушек, которые ожидают выдачи
    public void addToyDrawn(Toy toy) {
        Toy toyDrawn = new Toy(0, "", 1, 0);
        toyDrawn.setName(toy.getName());
        toyDrawn.setId(toy.getId());
        if (toyDrawnList.isEmpty()) {
            this.toyDrawnList.add(toyDrawn); 
        } else {
            boolean i = false;
            for (Toy t : toyDrawnList) {                
                if (toyDrawn.getName().equals(t.getName() )) {
                    i = true;
                    t.setAmount(t.getAmount() + 1);
                }                
            }
            if (!i) {
                this.toyDrawnList.add(toyDrawn); 
            }
        }
    }

    public List<Toy> getToyDrawn() {
        return this.toyDrawnList;
    }

    // добавление в список полученных призовых игрушкек
    public void addIssuedToy(Toy toy) {
        Toy toyIssued = new Toy(0, "", 1, 0);
        toyIssued.setName(toy.getName());
        toyIssued.setId(toy.getId());
        if (toyIssuedList.isEmpty()) {
            this.toyIssuedList.add(toyIssued);
        } else {
            boolean i = false;
            for (Toy t : toyIssuedList) {                
                if (toyIssued.getName().equals(t.getName() )) {
                    i = true;
                    t.setAmount(t.getAmount() + 1);
                }                
            }
            if (!i) {
                this.toyIssuedList.add(toyIssued); 
            }
        }
    }

    public List<Toy> getIssuedToy() {
        return this.toyIssuedList;
    }

    @Override
    public Iterator<Toy> iterator() {
        return toyList.iterator();
    }

}
