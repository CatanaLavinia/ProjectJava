package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.println("My dog name is: " + myDog.name);
        System.out.println("My dog`s breed is: " + myDog.breed);


        DogFood food = new DogFood();
        System.out.println("Favorite food brand is: " + food.foodBrand);

        Girl dogOwner = new Girl();
        System.out.println("Dog owner name is: " + dogOwner.name);

        Veterinary vet = new Veterinary();
        System.out.println("My dog`s veterinary name is: " + vet.name);

    }

}
