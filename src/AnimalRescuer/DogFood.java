package AnimalRescuer;

public class DogFood {

    private String foodBrand;
    private int quantityInGrams;
    private int price;
    private int mealsPerDay;

    public String getFoodBrand() {
        return foodBrand;
    }

    public void setFoodBrand(String foodBrand) {
        this.foodBrand = foodBrand;
    }

    public int getQuantityInGrams() {
        return quantityInGrams;
    }

    public void setQuantityInGrams(int quantityInGrams) {
        this.quantityInGrams = quantityInGrams;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public void setMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
    }

    public void buy() {
        System.out.println("Take a bag of food");
    }

}
