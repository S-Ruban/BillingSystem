import java.io.IOException ;
import java.util.Calendar ;
import java.util.Date ;
import java.util.Scanner ;
public class BillingSystem 
{
    static Scanner sc = new Scanner(System.in);
    static float amt = 0.0f ;
    static int bill[][] = new int[5][5];
    
    static void breakfast() throws IOException
    {
        System.out.println("\n=====BREAKFAST MENU=====\n");
        System.out.println("1. Idly(1) \t\t\t Rs.10.00");
        System.out.println("2. Dosa(1) \t\t\t Rs.15.00");
        System.out.println("3. Coffee(1) \t\t\t Rs.10.00");
        System.out.println("4. Tea(1) \t\t\t Rs.5.00");
        System.out.print("\nYour choice : ");
        int c = sc.nextInt();
        int qty ;
        switch(c)
        {
            case 1 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[0][0] += qty ;
                bill[0][1] += 10*qty ;
                break ;
            case 2 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[1][0] += qty ;
                bill[1][1] += 15*qty ;
                break ;
            case 3 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[2][0] += qty ;
                bill[2][1] += 10*qty ;
                break ;
            case 4 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[3][0] += qty ;
                bill[3][1] += 5*qty ;
                break ;
            default :
                System.out.println("\nEnter a number between 1 and 4.");
                breakfast();
        }
        System.out.print("\nDo you want to order more? (Y/N) : ");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        switch(ch)
        {
            case 'Y' :
                breakfast();
                break ;
            case 'N' :
                for(int x = 0; x < 5; x++)
                    amt += bill[x][1];
                System.out.println("\n=====BILL=====\n");
                System.out.println("Item \t Quantity \t Price");
                if(bill[0][0] != 0)
                {
                    System.out.print("Idly \t");
                    System.out.print(bill[0][0] + "\t\t");
                    System.out.println(bill[0][1]);
                }
                if(bill[1][0] != 0)
                {
                    System.out.print("Dosa \t");
                    System.out.print(bill[1][0] + "\t\t");
                    System.out.println(bill[1][1]);
                }
                if(bill[2][0] != 0)
                {
                    System.out.print("Coffee \t");
                    System.out.print(bill[2][0] + "\t\t");
                    System.out.println(bill[2][1]);
                }
                if(bill[3][0] != 0)
                {
                    System.out.print("Tea \t");
                    System.out.print(bill[3][0] + "\t\t");
                    System.out.println(bill[3][1]);
                }
                System.out.println("\nBill : Rs." + amt);
                System.out.println("VAT(14.5%) : Rs." + (amt*0.145f));
                System.out.println("Total Amount : Rs." + (amt*1.145f));
                break ;
            default :
                System.out.println("Please enter 'Y' or 'N'.");
                breakfast();
        }
    }
    
    static void lunch() throws IOException
    {
        System.out.println("\n=====LUNCH MENU=====\n");
        System.out.println("1. Veg Meals(1) \t\t\t Rs.80.00");
        System.out.println("2. Non-Veg Meals(1) \t\t\t Rs.100.00");
        System.out.print("\nYour choice : ");
        int c = sc.nextInt();
        int qty ;
        switch(c)
        {
            case 1 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[0][0] += qty ;
                bill[0][1] += 80*qty ;
                break ;
            case 2 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[1][0] += qty ;
                bill[1][1] += 100*qty ;
                break ;
            default :
                System.out.println("\nPlease enter either 1 or 2.");
                lunch();
        }
        System.out.print("\nDo you want to order more? (Y/N) : ");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        switch(ch)
        {
            case 'Y' :
                lunch();
                break ;
            case 'N' :
                for(int x = 0; x < 5; x++)
                    amt += bill[x][1];
                System.out.println("\n=====BILL=====\n");
                System.out.println("Item \t Quantity \t Price");
                if(bill[0][0] != 0)
                {
                    System.out.print("Veg Meals \t");
                    System.out.print(bill[0][0] + "\t\t");
                    System.out.println(bill[0][1]);
                }
                if(bill[1][0] != 0)
                {
                    System.out.print("Non-Veg Meals \t");
                    System.out.print(bill[1][0] + "\t\t");
                    System.out.println(bill[1][1]);
                }
                System.out.println("\nBill : Rs." + amt);
                System.out.println("VAT(14.5%) : Rs." + (amt*0.145f));
                System.out.println("Total Amount : Rs." + (amt*1.145f));
                break ;
            default :
                System.out.println("Please enter 'Y' or 'N'.");
                lunch();
        }
    }
    
    static void dinner() throws IOException
    {
        System.out.println("\n=====DINNER MENU=====\n");
        System.out.println("1. Roti(1) \t\t\t Rs.10.00");
        System.out.println("2. Mixed Veg Gravy(1) \t\t\t Rs.80.00");
        System.out.println("3. Chicken Gravy(1) \t\t\t Rs.100.00");
        System.out.println("4. Veg Biriyani(1) \t\t\t Rs.40.00");
        System.out.println("5. Chicken Biriyani(1) \t\t\t Rs.70.00");
        System.out.print("\nYour choice : ");
        int c = sc.nextInt();
        int qty ;
        switch(c)
        {
            case 1 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[0][0] += qty ;
                bill[0][1] += 10*qty ;
                break ;
            case 2 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[1][0] += qty ;
                bill[1][1] += 80*qty ;
                break ;
            case 3 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[2][0] += qty ;
                bill[2][1] += 100*qty ;
                break ;
            case 4 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[3][0] += qty ;
                bill[3][1] += 40*qty ;
                break ;
            case 5 :
                System.out.print("\nEnter the quantity : ");
                qty = sc.nextInt();
                bill[4][0] += qty ;
                bill[4][1] += 70*qty ;
                break ;
            default :
                System.out.print("\nEnter a number between 1 and 5.");
                breakfast();
        }
        System.out.print("\nDo you want to order more? (Y/N) : ");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        switch(ch)
        {
            case 'Y' :
                dinner();
                break ;
            case 'N' :
                for(int x = 0; x < 5; x++)
                    amt += bill[x][1];
                System.out.println("\n=====BILL=====\n");
                System.out.println("Item \t Quantity \t Price");
                if(bill[0][0] != 0)
                {
                    System.out.print("Roti \t");
                    System.out.print(bill[0][0] + "\t\t");
                    System.out.println(bill[0][1]);
                }
                if(bill[1][0] != 0)
                {
                    System.out.print("Mixed Veg Gravy \t");
                    System.out.print(bill[1][0] + "\t\t");
                    System.out.println(bill[1][1]);
                }
                if(bill[2][0] != 0)
                {
                    System.out.print("Chicken Gravy \t");
                    System.out.print(bill[2][0] + "\t\t");
                    System.out.println(bill[2][1]);
                }
                if(bill[3][0] != 0)
                {
                    System.out.print("Veg Biriyani \t");
                    System.out.print(bill[3][0] + "\t\t");
                    System.out.println(bill[3][1]);
                }
                if(bill[4][0] != 0)
                {
                    System.out.print("Chicken Biriyani \t");
                    System.out.print(bill[4][0] + "\t\t");
                    System.out.println(bill[4][1]);
                }
                System.out.println("\nBill : Rs." + amt);
                System.out.println("VAT(14.5%) : Rs." + (amt*0.145f));
                System.out.println("Total Amount : Rs." + (amt*1.145f));
                break ;
            default :
                System.out.println("Please enter 'Y' or 'N'.");
                dinner();
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        for(int x = 0;  x< 5; x++)
        {
            for(int y = 0; y < 5; y++)
                bill[x][y] = 0 ;
        }
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);
        int hr = c.get(Calendar.HOUR_OF_DAY);
        System.out.println("===============RUBAN'S RESTAURANT============\n");
        System.out.println("Breakfast timings : 07:00 - 10:00");
        System.out.println("Lunch timings : 13:00 - 16:00");
        System.out.println("Dinner timings : 19:00 - 22:00");
        if(hr >= 7 && hr < 10)
            breakfast();
        else if(hr >= 13 && hr < 16)
            lunch();
        else if(hr >= 19 && hr < 22)
            dinner();
        else
            System.out.println("\nSorry, but the restaurant is currently closed... Please come again later.");
    }  
}