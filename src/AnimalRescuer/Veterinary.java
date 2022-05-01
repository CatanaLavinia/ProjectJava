package AnimalRescuer;

public class Veterinary {

    private String name;
    private int vetExperienceInYears;
    private String address;
    private boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVetExperienceInYears() {
        return vetExperienceInYears;
    }

    public void setVetExperienceInYears(int vetExperienceInYears) {
        this.vetExperienceInYears = vetExperienceInYears;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }



    public void healthCheck() {
        System.out.println("Check dog health periodically");
    }
    public void vaccineAdministration() {
        System.out.println("Auchhh");
    }

}
