import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[][] citiesTemp =
            {
                {23,34,30,25,26,25},
                {15,16,12,18,16,10}
            };

        for (int i = 0; i < citiesTemp.length; i++) {
            Integer[] cityTemp = citiesTemp[i];
            Integer hightestTemp = null, lowestTemp = null;
            for (Integer temp : cityTemp) {
                if (hightestTemp == null || temp > hightestTemp) hightestTemp = temp;
                if (lowestTemp == null || temp < lowestTemp) lowestTemp = temp;
            }
            System.out.println("The highest temperatures in city " + i+1 + ": " + hightestTemp);
            System.out.println("The lowest temperatures in city " + i+1 +": " + lowestTemp);
        }
    }
}