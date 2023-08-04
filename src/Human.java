import java.util.*;


public class Human {
    private String mother1;
    private  String father1;
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;

    private Family family;
    private String mother;
    private String father;


    private List<String> activity = new ArrayList<>();
    private Pet favoritePet;
    private Map<String, String> schedule;
 private Pet pet;

    public Human(Pet pet) {
        this.pet = pet;
    }

    public Human(String name, String surname, int i, int yearOfBirth, String mother1, String father1, Pet pet1) {
        this.mother1 = String.valueOf(mother1);
        this.name=name;
        this.surname=surname;
        this.iq=i;
        this.yearOfBirth=yearOfBirth;
        this.mother= String.valueOf(mother1);
        this.father= String.valueOf(father1);
        this.pet=pet1;


    }

    public Human(String name, String surname, int i, int i1, String mother2, String father2, Map<String, String> schedule2, Pet pet) {
        this.name=name;
        this.surname=surname;
        this.iq=i1;
        this.yearOfBirth=i;
        this.mother=mother2;
        this.father=father2;
        this.pet=pet;
        this.schedule=schedule;
    }



    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", iq=" + iq +

                ", family=" + family +
                ", mother=" + mother +
                ", father=" + father +
                ", activity=" + activity +
                ", favoritePet=" + favoritePet +
                ", schedule=" + schedule +
                '}';
    }

    static final class Man extends Human {
        public Man(String childName, double averageIQ) {
        }

        public void greetPet() {
            System.out.println("Man: Hey Buddy, come here");
        }

        public void repairCar() {
            System.out.println("Man: Let's go fix the car");
        }
    }

    static final class Woman extends Human {
        public Woman(String childName, double averageIQ) {
        }

        public void greetPet() {
            System.out.println("Woman: Hey dear, come to mommy");
        }

        public void makeUp() {
            System.out.println("Woman: It is time to make up");
        }
    }







    public Human (String name, String surname, int i, int i1, Pet pet1, Human mother1, Human father1, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = i;
        this.iq = i1;
        this.pet= pet1;
        this.mother1 = String.valueOf(mother1);
        this.father1 = String.valueOf(father1);
        this.schedule = schedule;

    }


    public Human(String name, String surname, int i) {
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

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public void welcomePet() {

        if (pet!= null) {
            System.out.println("Hello, " + pet.nickname);
        } else {
            System.out.println("No pet to welcome.");
        }
    }
    public void describePet() {
        if (pet!= null) {

            String trickLevelDescription = (pet.trickLevel > 50) ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.nickname + ", he is " + Pet.age + " years old, he is " + trickLevelDescription + " (trick level: " + pet.getTrickLevel() + ")");
        } else {
            System.out.println("No pet to describe.");
        }
    }

    public boolean feedPet(boolean isTimeForFeeding) {
        if(pet!=null) {
            int randomNum = new Random().nextInt(101);
            if (isTimeForFeeding || pet.getTrickLevel() > randomNum) {
                System.out.println("Hm... I will feed " + pet.getNickname());
                return true;
            } else {
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
                return false;
            }
        }
                System.out.println("No pet to welcome.");
        return isTimeForFeeding;
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



