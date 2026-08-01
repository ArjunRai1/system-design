//EXAMPLE OF SIMPLE FACTORY DESIGN

interface MakeBurger{
    void prepare();
}

class StandardBurger implements MakeBurger{
    public void prepare(){
        System.out.println("This is a standard burger");
    }
}

class PremiumBurger implements MakeBurger{
    public void prepare(){
        System.out.println("This is a premium burger");
    }
}

class BurgerFactory{
    public MakeBurger returnInstance(String type){
        if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else
            return new PremiumBurger();
    }
}

public class Burger{
    public static void main(String[] args){
        BurgerFactory burgerFactory = new BurgerFactory();
        MakeBurger burger = burgerFactory.returnInstance("premium");
        burger.prepare();
    }
}