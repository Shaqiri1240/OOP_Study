package domen;

public class Bottle extends Product {
    double bottleVolume;

    /**
     * Конструктор
     *
     * @param name  - имя продукта
     * @param price - цена продукта
     * @param place - место, занимаемое продуктом
     */
    public Bottle(String name, int price, int place, double bottleVolume) {
        super(name, price, place);
        this.bottleVolume = bottleVolume;
    }
    @Override
    public String toString(){
        return super.toString() + "volume = "+bottleVolume ;
    }
}
