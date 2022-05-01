package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("Blacky");
        System.out.println("My dog name is: " + myDog.getName());
        myDog.setBreed("Male");
        System.out.println("My dog`s breed is: " + myDog.getBreed());


        DogFood food = new DogFood();
        food.setFoodBrand("Royal Canin");
        System.out.println("Favorite food brand is: " + food.getPrice());

        Girl dogOwner = new Girl();
        dogOwner.setName("Lavinia");
        System.out.println("Dog owner name is: " + dogOwner.getName());

        Veterinary vet = new Veterinary();
        vet.setName("Preda");
        System.out.println("My dog`s veterinary name is: " + vet.getName());

    }

}
