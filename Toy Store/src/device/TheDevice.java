package device;

import model.Bear;
import model.Cat;
import model.Toy;
import model.Type;

import java.util.List;

public class TheDevice {

    private List<Toy> toyList;

    public TheDevice(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void add(String toyName, int toyWeight, Type type){
        int id = getFreeId(type);
        if(Type.BEAR == type){
            Bear bear = new Bear(toyName, toyWeight, id);
            toyList.add(bear);
        }
        if(Type.CAT == type){
            Cat cat = new Cat(toyName, toyWeight, id);
            toyList.add(cat);
        }
    }

    public Toy getToyByWeight(int Weight){

        for(Toy toy: toyList){
            if(toy.getToyWeight() == Weight){
                return toy;
            }
        }
        return null;
    }

    private int getFreeId(Type type){
        boolean itsBear = Type.BEAR == type;
        int lastId = 1;
        for (Toy toy: toyList){
            if(toy instanceof Cat && !itsBear){
                lastId = ((Cat) toy).getCatId() + 1;
            }
            if(toy instanceof Bear && itsBear){
                lastId = ((Bear) toy).getBearId() + 1;
            }
        }
        return lastId;
    }


}
