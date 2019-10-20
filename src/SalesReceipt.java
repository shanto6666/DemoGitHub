import java.util.Scanner;

public class SalesReceipt {

		// Variable Declaration  
		static String nameOfCustomer;
		static String nameOfProducts;
		static double numberOfPurchases;
		static double priceOfProduct;
		static  double grossAmount;
		static double discountedPrices;

		

		// Module : Wellcome 
		public static void wellCOme() {
			System.out.println("Well Come to Pabna Bazar ");
			System.out.println("");
			System.out.println("");
		}

		public static void getInput() {

			
			

			// Taking a object Reference for Scanning information from any Input syste
			Scanner salesscan = new Scanner(System.in);


			System.out.println("Enter Name OF Customer ");
			nameOfCustomer = salesscan.nextLine();

			System.out.println("Enter Of Product Name ");
			nameOfProducts = salesscan.nextLine();


			System.out.println("Enter  Number Of Purchase");
		    numberOfPurchases = salesscan.nextDouble();
		    
		    System.out.println("Enter Price Of Product");
		     priceOfProduct= salesscan.nextDouble();
		     
		     

		}

		public static void calculateGrossAmount() {
			
			
			
			// Process
			grossAmount = numberOfPurchases *priceOfProduct;

		}

		
		public static void calculateDiscountedPrices() {
			
			
			 if(grossAmount >0 &&  grossAmount <=100 ) {
				discountedPrices = grossAmount;
			} else if(grossAmount > 100 &&  grossAmount<500 ) {
				discountedPrices = grossAmount - 10;
			} else if(grossAmount >= 500 &&  grossAmount<1000 ) {
				discountedPrices = grossAmount - 20;
			} else if(grossAmount >= 1000  ) {
				discountedPrices = grossAmount - 30;
			}
			else {
				discountedPrices=0;
				System.out.println("Invalid Input : Cannot Calculate Sales Reciept");
				
				grossAmount=0;
				System.out.println("Invalid Input : Cannot Calculate Sales Reciept");
				
				numberOfPurchases=0;
						System.out.println("Invalid Input : Cannot Calculate Sales Reciept");
			}
		}
			
			
	
			

			
		
		
		
		
		public static void displayOutput() {

			
			// Display Out Put
			System.out.println("");
			System.out.println("==================================================");
			System.out.println("Customer Name  : " + nameOfCustomer);
			System.out.println(" Product Name  : " +nameOfProducts);
			System.out.println("Quantity Of Purchaces   : "+ numberOfPurchases);
			System.out.println(" Gross Amount to Pay  : "+ grossAmount);
			System.out.println("Discount  : "+ (grossAmount -discountedPrices));
			System.out.println("Final Discounted prices: "+ discountedPrices);
			
			System.out.println("==================================================");


		}

		public static void exitProgram() {


			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for shopping! ");

		}




		public static void main(String[] args) {

			
			wellCOme();

			
			// Pre Conditonal Loop 
			
			for(int i=0; i<10;i++) {
				
				System.out.println("Customer  : " + (i+1) + "******");
				
				getInput();
				calculateGrossAmount();
				calculateDiscountedPrices();
				displayOutput();
				
				
				String doYouwantToContinue;
				Scanner choiceScanner = new Scanner(System.in);
				
				
				System.out.println("DO You Want to continue ? ");
				doYouwantToContinue = choiceScanner.nextLine();
				
				if(doYouwantToContinue.equals("no")) {
					break;
				}
				
				
				
			}
			
			
			
		
			exitProgram();
					
			
		}

	}