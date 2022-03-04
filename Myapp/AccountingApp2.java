
public class AccountingApp2 {
	
	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double income = valueOfSupply - valueOfSupply*expenseRate;
		double expense = valueOfSupply*expenseRate;
		double total = valueOfSupply + vat;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		double [] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		if(income > 10000) {
			dividend1 = income * dividendRates[0];
			dividend2 = income * dividendRates[1];
			dividend3 = income * dividendRates[2];
		} else {
			dividend1 = income * 0.5;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total );
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		 int i = 0;
	     while(i < dividendRates.length) {
	            System.out.println("Dividend : " + (income*dividendRates[i]) );
	            i = i + 1;
	            }
	}

}