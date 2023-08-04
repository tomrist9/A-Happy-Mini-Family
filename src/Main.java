import java.util.*;

public class Main {

    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }


    public static void main(String[] args) {
        Pet.Fish fish = new Pet.Fish("Nemo");
        Pet.DomesticCat cat = new Pet.DomesticCat("Whiskers");
        Pet.Dog dog = new Pet.Dog("Buddy");
        Pet.RoboCat roboCat = new Pet.RoboCat();
        Pet.Cat cat1 =new Pet.Cat("Lucy");




        Pet unknownPet = new Pet((Set<String>) null){
            @Override
            public void speak() {

            }

            @Override
            public void play() {

            }

            @Override
            public void respond() {

            }
        };
        Pet.RoboCat robocat = new Pet.RoboCat("RoboKitty"){

           
            @Override
            public void speak() {

            }

            @Override
            public void play() {

            }

            @Override
            public void respond() {

            }

            @Override
            public void eat() {

            }
        };












        int numberofobjects = 10000000;

            for (int i = 0; i < numberofobjects; i++) {
                Human human = new Human();
            }
            Pet pet1 = new Pet(dog.nickname) {


                @Override
                public Species getSpecies() {
                    return super.getSpecies();
                }

                @Override
                public void speak() {

                }

                @Override
                public void play() {

                }

                @Override
                public void respond() {

                }
            };
            pet1.setAge(5);
            pet1.setTrickLevel(75);
            pet1.setHabits(new HashSet<>());
            pet1.species= Pet.Species.DOG;

            Human mother1 = new Human("Jane", "Karleone", 1970);
            Human father1 = new Human("Vito", "Karleone", 1965);


        Map<String, String> schedule1= new HashMap<>();
        schedule1.put("eat", "drink");




            Human child1 = new Human("Michael", "Karleone", 1995, 90, "Jane", "Vito",
                    dog);
            child1.welcomePet();
            child1.describePet();
            child1.feedPet(true);

            System.out.println(child1.toString());

            System.out.println(pet1.toString());


            Pet pet2 = new Pet(cat1.nickname) {



                @Override
                public Species getSpecies() {
                    return super.getSpecies();
                }




                @Override
                public void speak() {

                }

                @Override
                public void play() {

                }

                @Override
                public void respond() {

                }
            };
            pet2.setAge(7);
            pet2.setTrickLevel(70);
            pet2.setHabits(new HashSet<>());

            Human mother2 = new Human("Kate", "Smith", 1975);
            Human father2 = new Human("John", "Smith", 1977);


           Map<String , String > schedule2=new HashMap<>();
       schedule2.put("eat", "swimming");


        Human child2 = new Human("Karl", "Smith", 1997, 90, "Nuna", "Lukas", schedule2, cat1);


            child2.welcomePet();
            child2.describePet();
            child2.feedPet(true);

            System.out.println(child2.toString());

            System.out.println(pet2.toString());


        }


    }
