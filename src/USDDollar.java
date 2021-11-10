/*
 * class USDDollar extends Coin
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDDollar extends Coin {
    /*
     * Coin constructor
     * @param double denomination
     * @param String countryCode
     * @param smelting composition
     */
    public USDDollar(double denomination, String countryCode, smelting composition) {
        super(denomination, countryCode, composition);
    }
    /*
     * Method to run minting message
     * @return void
     */
    public void display () {
        System.out.println("Minting a USD Dollar!");
    }
}
