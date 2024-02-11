public class FeedPrice
{
    /**
        Holds prices of Animal feed
    */
    double priceAlpaca;
    double priceGoat;
    double priceChicken;
    
    /**
        Constructor
        @param pA The price of Alpaca feed
        @param pG The price of Goat feed
        @param pC The price of Chicken feed
    */
    public FarmCosts(double pA, double pG, double pC)
    {
        priceAlpaca=pA;
        priceGoat=pG;
        priceChicken=pC;
    }
    
    /**
        Constructor
    */
    public FarmCosts()
    {
        priceAlpaca=0;
        priceGoat=0;
        priceChicken=0;
    }

    public double setAlpacaPrice(double pA)
    {
        if (pA > 0)
            priceAlpaca = pA;
        else
            System.out.println("The price can't be below $0.00.");
    }

    public getAlpacaPrice()
    {
        return priceAlpaca;
    }
}