class House
{
    int noofrooms,noofkitchens;
    String shape;
    
    void assignhouse(int a, int b, String s, Kitchen k)
    {
        noofrooms=a;
        noofkitchens=b;
        shape=s;
        System.out.println("noofrooms: "+noofrooms);
        System.out.println("noofkitchens: "+noofkitchens);
        System.out.println("shape: "+shape);
        System.out.println("noofdrawers: "+k.noofdrawers);
        
    }
    
    
}

class Kitchen
{
    String type;
    int noofdrawers;
    
    void assignkitchen(int a, String s)
    {
        noofdrawers=a;
        type=s;
    }
    
}

public class Main
{
    public static void main (String[] args) 
    {
        House houseone = new House();
        House housetwo = new House();
        Kitchen kitchenone = new Kitchen();
        Kitchen kitchentwo = new Kitchen();
        
        kitchentwo.assignkitchen(10,"modular");
        kitchenone.assignkitchen(20,"non-modular");
        houseone.assignhouse(3,1,"rectangular", kitchenone);
        System.out.println();
        houseone.assignhouse(3,1,"rectangular", kitchentwo);
        
    }
    
}
