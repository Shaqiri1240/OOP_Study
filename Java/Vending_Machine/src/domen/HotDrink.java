package domen;
import domen.Bottle;
public class HotDrink extends Product{
    private int drinkTemp;

    /**
     * Конструктор
     *
     * @param name  - имя продукта
     * @param price - цена продукта
     * @param place - место, занимаемое продуктом
     */
    public HotDrink(String name, int price, int place, int drinkTemp) {
        super(name, price, place);
        this.drinkTemp = drinkTemp;
    }
    @Override
    public String toString(){
        return super.toString() + "Temperature of the drink = "+drinkTemp+ " degrees";
    }
}
