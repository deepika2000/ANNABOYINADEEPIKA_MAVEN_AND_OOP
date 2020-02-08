package com.epam;
import java.util.*;
class Hersheys extends NewYearGift {
    int quantity;

    public Hersheys(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}
class Ferrero_Rocher extends NewYearGift{
	int quantity;

    public Ferrero_Rocher(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}
class Munch extends NewYearGift{
int quantity;

    public Munch(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Bournville extends NewYearGift{
int quantity;

    public Bournville(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class KitKat extends NewYearGift{
int quantity;

    public KitKat(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Perk extends NewYearGift{
int quantity;

    public Perk(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Dairy_Milk extends NewYearGift{
int quantity;

    public Dairy_Milk(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	//int n = sc.nextInt();
        //NewYearGift nyg = new NewYearGift();
        //nyg.PrintN(n);
    	int quantity = 0, total_candies = 0;
        char n1;
        NewYearGift collect;
        Boolean n = true;
        int price, weight = 0,totalbox_wt = 0, total_weight = 0;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Fill the New Year Gift Box!!");
        ArrayList<NewYearGift> hm =  new ArrayList<NewYearGift>();
        while(n) {
        System.out.println("AVAILABLE Candies");
        System.out.println("1. Hersheys");
        System.out.println("2. Kitkat");
        System.out.println("3. Munch");
        System.out.println("4. Ferrero Rocher");
        System.out.println("5. Bournville");
        System.out.println("6. Perk");
        System.out.println("7. Dairy Milk");
        System.out.println("8. Calculate Total Weight of candies");
        System.out.println("9. Sort and Display all gifts");
        System.out.println("Choose an option 1-9");
        try {
       
        switch(sc.next().charAt(0))
        {
        case '1':
        System.out.println("Please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter Price");
        price = sc.nextInt();
        collect = new Hersheys("Hersheys", price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        System.out.println("Do you want to add any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
             n = true;
                 break;
               }
        else
            {
        n = false;
        break;
            }
        case '2':
        System.out.println("please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter price");
        price = sc.nextInt();
        collect = new Ferrero_Rocher("Ferrero_Rocher",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("Do you want to add any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y')
                {
        n = true;
        break;
                }
        else {
        n = false;
        break;
               }
        case '3':
        System.out.println("Please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Please enter the price");
        price = sc.nextInt();
        collect = new Munch("Munch",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("do you want to add any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        break;
        }
        case '4':
        System.out.println("please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter price");
        price = sc.nextInt();
        collect = new KitKat("KitKat",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies = total_candies + quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("Do you want to add any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        break;
        }
          case '5':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Enter price");
          price = sc.nextInt();
          collect = new Bournville("Bournville",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          

      
          System.out.println("Do you want to add any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '6':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Please enter the price");
          price = sc.nextInt();
          collect = new Perk("Perk",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          
          System.out.println("Do you want to add any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '7':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Please enter the price");
          price = sc.nextInt();
          collect = new Dairy_Milk("Dairy_Milk",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          
          System.out.println("Do you want to add any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '9':
          Collections.sort(hm,new SortByPrice());
          for(NewYearGift i:hm) {
        	  System.out.println("Name: "+i.getName()+" Price: "+i.getPrice()+" Weight: "+i.getWeight());
          }
          System.out.println(hm);
          break;
          case '8':
        	  System.out.println(total_weight);
        	  break;
        	  default:
        		  System.out.println("Enter valid Input");
        		  break;
        }}
        catch(Exception e)
        {
        System.out.println("please select your favorite chocolate");
           
       
       
    }}
        
        System.out.println("The following candies are present in the Gift Box!!");
        System.out.println(hm);
        System.out.println("Total weight of gift box:" +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox:" +total_candies);
        sc.close();
    }
}