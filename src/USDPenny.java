/**class USDPenny extends Coin.
 * @author group deepFake
 * (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDPenny extends Coin {
    /**Coin constructor.
     * @param denomination coin value
     * @param countryCode country of origin
     * @param composition metalurgical composition
     */
    public USDPenny(double denomination, String countryCode, 
    smelting composition) {
        super(denomination, countryCode, composition);
    }
    /**Method to run minting message.
    */
    public void display() {
        System.out.println("Minting a USD Penny!");
    }
}
