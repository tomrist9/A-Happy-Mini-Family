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



        Pet unknownPet = new Pet(null){
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
            pet1.setHabits(new String[]{"eat", "drink", "sleep"});

            Human mother1 = new Human("Jane", "swimming", 1970);
            Human father1 = new Human("Vito", "Karleone", 1965);


            String[][] schedule1 = {{"eat"}, {"run"}, {"sleep"}};


            Human child1 = new Human("Michael", "Karleone", 1995, 90, pet1, mother1, father1, schedule1);
            child1.welcomePet();
            child1.describePet();
            child1.feedPet(true);

            System.out.println(child1.toString());

            System.out.println(pet1.toString());


            Pet pet2 = new Pet() {
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
            pet2.setHabits(new String[]{"eat", "mewoing", "sleep"});

            Human mother2 = new Human("Kate", "Smith", 1975);
            Human father2 = new Human("John", "Smith", 1977);


            String[][] schedule2 = {{"eat"}, {"swimming"}, {"sleep"}};


            Human child2 = new Human("Karl", "Smith", 1997, 90, pet2, mother2, father2, schedule2);
            child2.welcomefavouritePet();
            child2.describePet();
            child2.feedPet(true);

            System.out.println(child2.toString());

            System.out.println(pet2.toString());


        }


    }
