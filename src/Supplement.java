

/**
 * @version 1.8.0_171
 * @author rahmansuhail
 **/
public class Supplement {

    private String supplementName;
    private double weeklyCost;

    /**
     * Default constructor Supplement
     * <p>
     * This class is used to represent Supplement with Associatename,sName,weeklyCost,super constructor
     * </p>
     * Precondition: Supplement object of sName,weeklyCost
     * @param sName
     * @param weeklyCost
     */
    public Supplement() { //
        supplementName = "sName";
        weeklyCost = 0.0;
    }

    /**
     * Constructor Supplement 
     * <p>
     * This class is used to represent Supplement with SupplementN,sWeeklycost
     * </p>
     * @param supplementN
     * @param sWeeklycost
     */
    public Supplement(String supplementN, double sWeeklycost) {
        SetSupplement(supplementN, sWeeklycost);
    }

    /**
     *
     * @param supplementN
     * @param sWeeklycost
     */
    public void SetSupplement(String supplementN, double sWeeklycost) {
        this.supplementName = supplementN;
        this.weeklyCost = sWeeklycost;

    }

    /**
     *
     * @return supplementName
     */
    public String getSupplementName() {
        return supplementName;
    }

    /**
     *
     * @param SupplementName
     */
    public void setSupplementName(String SupplementName) {
        this.supplementName = SupplementName;
    }

    /**
     *
     * @return weeklyCost
     */
    public double getWeeklyCost() {
        return weeklyCost;
    }

    /**
     *
     * @param mWeeklyCost
     */
    public void setWeeklyCost(double mWeeklyCost) {
        this.weeklyCost = mWeeklyCost;
    }

    /**
     *
     * @return supplementName, weeklyCost
     */
    public String toString() {
        return "" + supplementName + "\nWeekly_Cost : " + weeklyCost;
    }
}
