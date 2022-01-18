package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship newShip){
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight){
        int remainingPersons = passengers;
        int remainingCargo = cargoWeight;
        for (Ship actual : ships){
            if (actual instanceof CanCarryPassengers){
                if (remainingPersons != 0){
                    remainingPersons = ((CanCarryPassengers) actual).loadPassengers(remainingPersons);
                }
            }
            if (actual instanceof CanCarryGoods){
                if (remainingCargo !=0){
                    remainingCargo = ((CanCarryGoods) actual).loadCargo(remainingCargo);
                }
            }
        }
        waitingPeople = remainingPersons;
        waitingCargo = remainingCargo;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
