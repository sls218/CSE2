///////////
//Steph Stieber
//9-6-15
//Arithmetic Java Program 
//Calculates the total bill of items 
//at Walmart plus 6% PA sales tax

//define a class
public class Arithmetic{
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
        System.out.println(nSocks+ " socks cost $" + sockCost$ + " per unit");
        System.out.println(nGlasses+ " glasses cost $" + glassCost$ + " per unit");
        System.out.println(nEnvelopes+ " envelope costs $" + envelopeCost$ + " per unit");
        
        //print total cost of each item with its corresponding tax
        System.out.println("Total sock cost = \t$" + totalSockCost$
        + ";\t sock tax = $" + sockTax$);
        System.out.println("Total glass cost = \t$" + totalGlassCost$
        + ";\t glass tax = $" + glassTax$);
        System.out.println("Total envelope cost = \t$" + totalEnvelopeCost$
        + ";\t envelope tax = $" + envelopeTax$);
        
        //print the subtotal
        System.out.println("Subtotal = \t\t$"+ totalPurchase$);
        //print the total sales tax
        System.out.println("Total sales tax = \t$" + totalTax$);
        //print the total purchse
        System.out.println("Total bill = \t\t$" + totalPaid$);
    }
}