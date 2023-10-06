package ch06.sec16problem.exam18;

public class ShopService {
    private static final ShopService singleton = new ShopService();

    private ShopService(){}

    public static ShopService getInstance(){
        return singleton;
    }

}

