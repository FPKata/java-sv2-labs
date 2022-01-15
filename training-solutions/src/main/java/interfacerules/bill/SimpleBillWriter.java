package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems){
            String[] temp = actual.split(";");
            int price = Integer.parseInt(temp[1]);
            int pieces = Integer.parseInt(temp[2]);
            sb.append(String.format("%s, %d * %d = %d Ft", temp[0], pieces, price, (pieces * price)))
                    .append("\n");
        }
        return sb.toString();
    }
}
