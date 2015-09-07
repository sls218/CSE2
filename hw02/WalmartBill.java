///////////
//Steph Stieber
//9-6-15
//Walmart Bill Java Program 
//Calculates the total bill of items 
//at Walmart plus 6% PA sales tax

//define a class
public class WalmartBill{
    //add main method
    public static void main(String[] args) {
        
    //declare input variables
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //6% sales tax
        double taxPercent=0.06;
        
        //total cost for socks
        double totalSockCost=nSocks*sockCost$;
        //total cost for glass
        double totalGlassCost=nGlasses*glassCost$;
        //total cost for envelopes
        double totalEnvelopeCost=nEnvelopes*envelopeCost$;
        
        //socks total tax
        double sockTax=totalSockCost*taxPercent;
        //glass total tax
        double glassTax=totalGlassCost*taxPercent;
        //envelope total tax
        double envelopeTax=totalEnvelopeCost*taxPercent;
        
        //purchase subtotal
        double totalPurchase=totalSockCost+totalGlassCost+totalEnvelopeCost;
        //total tax
        double totalTax=totalPurchase*taxPercent;
        //amount actually paid
        double totalPaid=totalPurchase+totalTax;
        
        //convert all doubles to ints and back to doubles
        //in order to truncate the unneeded decimals
        int totalSockCostint= (int) (totalSockCost*100);
        double totalSockCost$=(totalSockCostint/100.0);
        
        int totalGlassCostint= (int) (totalGlassCost*100);
        double totalGlassCost$=(totalGlassCostint/100.0);
        
        int totalEnvelopeCostint= (int) (totalEnvelopeCost*100);
        double totalEnvelopeCost$=(totalEnvelopeCostint/100.0);
        
        int sockTaxint= (int) (sockTax*100);
        double sockTax$=(sockTaxint/100.0);
        
        int glassTaxint= (int) (glassTax*100);
        double glassTax$=(glassTaxint/100.0);
        
        int envelopeTaxint= (int) (envelopeTax*100);
        double envelopeTax$=(envelopeTaxint/100.0);
        
        int totalPurchaseint= (int) (totalPurchase*100);
        double totalPurchase$=(totalPurchaseint/100.0);
        
        int totalTaxint= (int) (totalTax*100);
        double totalTax$=(totalTaxint/100.0);
        
        int totalPaidint= (int) (totalPaid*100);
        double totalPaid$=(totalPaidint/100.0);
        
        
        //print item, count, and cost/item on receipt
        System.out.println(nSocks+ " socks were purchased at a cost of $" + sockCost$);
        System.out.println(nGlasses+ " glasses were purchased at a cost of $" + glassCost$);
        System.out.println(nEnvelopes+ " envelope was purchased at a cost of $" + envelopeCost$);
        
        //print total cost of each item with its corresponding tax
        System.out.println("The socks will cost a total of $" + totalSockCost$
        + " with a tax of $" + sockTax$);
        System.out.println("The glass will cost a total of $" + totalGlassCost$
        + " with a tax of $" + glassTax$);
        System.out.println("The envelope will cost a total of $" + totalEnvelopeCost$
        + " with a tax of $" + envelopeTax$);
        
        //print the subtotal
        System.out.println("The subtotal is $"+ totalPurchase$);
        //print the total sales tax
        System.out.println("The total sales tax is $" + totalTax$);
        //print the total purchse
        System.out.println("The total Walmart bill is $" + totalPaid$);
    }
}