package onlineshopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//creating main class name as OnlineShopping 
public class OnlineShopping {
 
	//creating main method
	public static void main(String[] args) throws IOException  {
		
		//using Buffer Reader to make the inputs from the user
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		RetailStore obj=new RetailStore("Spencer HomeAppilance Shop");
       
	   
		int ass_id=0;
		String ass_name="",ass="";	
		int number;
		int ch;
		//creating product list 
		List<String> menuList  = new ArrayList<String>();
        //Adding the products 
        menuList.add("LG Television T101");
        menuList.add("LG Refrigerator R601");
        menuList.add("LG Micro Oven M701");
        menuList.add("LG Micro Oven M701");
        menuList.add("Samsung Galaxy Phone");
        /* display menu options */
    
		do
		{
	
			System.out.println("Enter the choice:");
			System.out.println("1.To add customer\n\t2.add product\n\t3.check product availability\n\t4.display\n\t5.book product\n\t6.calculate net amount\n\t7.Exit");			
		     ch=Integer.parseInt(br.readLine());
		   //using switch cases we are giving customer requirements
			switch(ch)
			{
				case 1:		System.out.println("------customer Addition-------");
						System.out.println("Enter the name of customer:");
						ass_name=br.readLine();
						System.out.println("enter the contact number");
						number=Integer.parseInt(br.readLine());
						
						obj.addCustomer(ass_name,number);
						break;
				
				case 2:		System.out.println("------product Addition-------");
						System.out.println("Enter product name:");
						ass_name=br.readLine();
						System.out.println("Enter the price of product:");
						double price=Double.parseDouble(br.readLine());
						System.out.println("enter the status");
						ass=br.readLine();
						
						obj.addProduct(ass_name,ass, price);
					
						break;
						
				case 3:		System.out.println("------check Availability-------");
						System.out.println("Enter the product name:");
						ass_name=br.readLine();
					
						int Number=obj.checkProductAvailability(ass_name);
						System.out.println("available product="+Number);
						break;
				case 4:		System.out.println("------Display-------");
						obj.display();
						break;
				case 5:		System.out.println("------booked Product-------");
						System.out.println("Enter the customer id:");
						ass_id=Integer.parseInt(br.readLine());
						System.out.println("enter the product name");
						ass_name=br.readLine();
						System.out.println("Enter the number of products:");
						number=Integer.parseInt(br.readLine());
						obj.bookProduct(ass_id, ass_name, number);
						break;
				case 6:		System.out.println("------calculate cost-------");
						System.out.println("Enter the customer id:");
						ass_id=Integer.parseInt(br.readLine());
						System.out.println("Enter the discount:");
						double discount=Double.parseDouble(br.readLine());
						
						double cost=obj.calculateNetAmount(ass_id, discount);
						System.out.println("Total cost="+cost);
						break;
			
				case 7:		System.out.println("ThankYou!");
						break;
						
				default:System.out.println("Invalid option!!");	
						
		
	
		
	}

		}while(ch!=7);
		}
}