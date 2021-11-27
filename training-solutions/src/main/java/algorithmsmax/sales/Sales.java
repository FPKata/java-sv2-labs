package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson personWithMaxSalesAmount = sales.get(0);
        for (Salesperson actual : sales){
            if (actual.getAmount() > personWithMaxSalesAmount.getAmount()){
                personWithMaxSalesAmount = actual;
            }
        }
        return personWithMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson best = sales.get(0);
        for (Salesperson actual : sales){
            if ((actual.getAmount() - actual.getTarget()) > best.getAmount() - best.getTarget()){
                best = actual;
            }
        }
        return best;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson worst = sales.get(0);
        for (Salesperson actual : sales){
            if ((actual.getAmount() - actual.getTarget()) < worst.getAmount() - worst.getTarget()){
                worst = actual;
            }
        }
        return worst;
    }
}
