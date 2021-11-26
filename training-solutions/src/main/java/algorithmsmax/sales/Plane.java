package algorithmsmax.sales;

public class Plane {
    public int getLongestOcean(String map){
        int longestOcean = 0;
        int counter = 0;
        for (int i = 0; i < map.length(); i++){
            if (map.charAt(i) == '0'){
                counter++;
            }else if (map.charAt(i) == '1' && counter > longestOcean){
                longestOcean = counter;
                counter = 0;
            }else{
                counter = 0;
            }
        }
        return longestOcean;
    }
}
