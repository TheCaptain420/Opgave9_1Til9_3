public class Opgave9komma2 {


    public static void main(String[] args) {
        //Laver en class/stock...
        Stock test = new Stock("Oracle Corporation","ORCL",34.35,34.50 );
        System.out.println("A New Stock with the name "+ test.name+ " and symbol "+test.symbol+" has been created.");
        System.out.println("It has a pricechange of " +test.getChangePrice()+ "%.");




    }

    static class Stock{
        //Declarer værdierne der skal bruges
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        //En constructor der tillader bruger at skrive værdier i classen
        Stock(String newName,String newSymbol,double newPrice, double oldPrice){
            name=newName;
            symbol=newSymbol;
            currentPrice=newPrice;
            previousClosingPrice = oldPrice;
        }


    //Laver en udregner, der tillader bruger at finde forskel i procent.
    double getChangePrice(){
         return currentPrice/previousClosingPrice;
    }

    }

}
