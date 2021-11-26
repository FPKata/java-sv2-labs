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

//    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
//
//    }
//
//    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
//
//    }
//
//    public int getMaxDifference(int amount, int target){
//        return target - amount;
//    }
}
