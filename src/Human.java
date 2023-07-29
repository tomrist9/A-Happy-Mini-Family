import java.util.Objects;
import java.util.Random;
import java.util.Arrays;


public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private Pet pet;
    private Family family;

    private String[][] activity;
    private Pet favoritePet;
    private Main.DayOfWeek schedule;


    static final class Man extends Human{
        public Man(String childName, double averageIQ) {
        }

        public void greetPet(){
       System.out.println("Man: Hey Buddy, come here");
   }
   public void repairCar(){
       System.out.println("Man: Let's go fix the car");
   }
    }
    static final class Woman extends Human{
        public Woman(String childName, double averageIQ) {
        }

        public void greetPet(){
        System.out.println("Woman: Hey dear, come to mommy");
    }
    public void makeUp(){
        System.out.println("Woman: It is time to make up");
    }
    }
    public Human(String name, String surname, int yearOfBirth, Main.DayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.schedule=schedule;
    }



    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Main.DayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.pet = pet;

        this.schedule = schedule;
    }

    public Human(Family family) {
        this.family = family;
    }

    public Human(String michael, String karleone, int i, int i1, Pet pet1, Human mother1, Human father1, String[][] schedule1) {
    }

    public Human(String jane, String swimming, int i) {
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getFavouritePet() {
        return favoritePet;
    }

    public void setFavouritePet(Pet favouritePet) {
        this.favoritePet = favouritePet;
    }

    public Human() {
    }

    public Main.DayOfWeek getSchedule() {
        return schedule;
    }

    public void setSchedule(Main.DayOfWeek schedule) {
        this.schedule = schedule;
    }

    public void welcomePet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        String trickLevelDescription = (pet.getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickLevelDescription + " (trick level: " + pet.getTrickLevel() + ")");
    }

    public boolean feedPet(boolean isTimeForFeeding) {
        int randomNum = new Random().nextInt(101);
        if (isTimeForFeeding || pet.getTrickLevel() > randomNum) {
            System.out.println("Hm... I will feed " + pet.getNickname());
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
    }
   public void welcomefavouritePet(){
        if(favoritePet!=null){
            System.out.println("Welcome"+favoritePet.getNickname());
        }else{
            System.out.println("No favorite pet to welcome.");
        }
   }
   public void describefavoritePet(){
        if(favoritePet!=null){
            System.out.println("My favorite pet is a " + favoritePet.getSpecies() + " named " + favoritePet.getNickname() + ".");
        } else {
            System.out.println("No favorite pet to describe.");
        }
        }
    public void feed() {
        if (favoritePet != null) {
            System.out.println("Feeding " + favoritePet.getNickname() + "...");
            // Logic to feed the favorite pet goes here...
        } else {
            System.out.println("No favorite pet to feed.");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", family=" + family +
                ", activity=" + Arrays.toString(activity) +
                ", favoritePet=" + favoritePet +
                ", schedule=" + schedule +
                '}';
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(yearOfBirth, human.yearOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth);
    }

    protected void finalize() throws Throwable {
        try {

        } finally {

            super.finalize();
        }
    }

    interface HumanCreator{
        Human bornChild(String fatherName, String motherName, double motherIQ, double fatherIQ, String name, int age);


    }




}



