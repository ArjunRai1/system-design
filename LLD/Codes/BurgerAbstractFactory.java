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

interface BurgerFactory{
     MakeBurger returnInstance();
}

class StandardBurgerFactory implements BurgerFactory{
    public MakeBurger returnInstance(){
        return new StandardBurger();
    }
}

class PremiumBurgerFactory implements BurgerFactory{
    public MakeBurger returnInstance(){
        return new PremiumBurger();
    }
}

class BurgerAbstractFactory{
    public static void main(String[] args){
        BurgerFactory burgerFactory = new PremiumBurgerFactory();
        MakeBurger burger = burgerFactory.returnInstance();
        burger.prepare();
    }
}