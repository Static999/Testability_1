public class BonusMilesService {
    public int calculate(int price) {
        int MyMiles;
        int QuantityPerMile = 20;
        MyMiles = price / QuantityPerMile;
        return MyMiles;


    }
}
