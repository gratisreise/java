package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //K는 Tv로 대체, M은 String으로 대체
        Product<Tv, String> prduct1 = new Product<>();

        //Setter 매개값은 반드시 Tv와 String을 제공
        prduct1.setKind(new Tv());
        prduct1.setModel("스마트Tv");

        //Getter 리턴값은 Tv와 String이 됨
        Tv tv = prduct1.getKind();
        String tvModel = prduct1.getModel();
        //------------------------------------------------
        //K는 Car로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product<>();

        //Setter 매개값은 반드시 Car와 String을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        //Getter 리턴값은 Car은 String이 됨
        Car car = product2.getKind();
        String carModel = product2. getModel();
    }
}
