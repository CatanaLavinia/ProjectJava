package AnimalRescuer;

public class Girl {

    private String name;
    private int dogAgeWhenAdopted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDogAgeWhenAdopted() {
        return dogAgeWhenAdopted;
    }

    public void setDogAgeWhenAdopted(int dogAgeWhenAdopted) {
        this.dogAgeWhenAdopted = dogAgeWhenAdopted;
    }


    public void feeding() {
        System.out.println("Feed the dog");
    }

    public void goToTheVet() {
        System.out.println("Go to the vet for health control");
    }
}
