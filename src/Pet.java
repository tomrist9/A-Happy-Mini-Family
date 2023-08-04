import java.util.*;

public abstract class Pet {



    public Species species;
    public String nickname;
    public static int age;
    protected int trickLevel;
    protected Set<String>habits = new HashSet<>();


    public Pet(Object o) {
    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
    }

    public abstract void speak();
    public abstract void play();
    public abstract void respond();



    public void setHabits(HashSet<String> habits) {
      {
            this.habits= Collections.singleton("woofs");
        }

    }


    public static class Fish extends Pet{
        public Fish(String nickname) {
            super( nickname);
        }

        public Fish() {
        super(Species.FISH);
        }


public void Pet(){
            this.species=Species.UNKNOWN;
}


        public void eat(String food) {
            System.out.println("The fish is eating ");
        }


        @Override
        public void speak() {

        }

        @Override
        public void play() {

        }

        public void respond() {
            System.out.println("The fish couldn't answer");
        }
    }

    public static class DomesticCat extends Pet{
        public DomesticCat(String nickname, int age, int trickLevel, Set<String>habits) {
            super(nickname, age, trickLevel, habits);
        }

        public DomesticCat() {
        super(Species.DOMESTICCAT);
        }

        public DomesticCat(String whiskers) {
        }

        @Override
        public void eat() {
            System.out.println("The cat is eating a bird");
        }

        @Override
        public void speak() {
            System.out.println("The cat can talk only with gestures");
        }

        @Override
        public void play() {
            System.out.println("The cat is playing ");
        }

        @Override
        public void respond() {
            System.out.println("The cat is saying meow");
        }
        public void foul() {
            System.out.println("The domestic cat made a mess!");
        }
    }
public static class Dog extends Pet{
    public Dog(String nickname, int age, int trickLevel, Set<String>habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Dog() {
    super(Species.DOG);
    }

    public Dog(String nickname) {
        this.nickname=nickname;
    }


    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
    public void speak() {
        System.out.println("Woof!");
    }
    @Override
    public void foul() {
        System.out.println("Sometimes the dog is disturbing");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing with children");
    }
    public void respond() {
        System.out.println("The dog responds and makes a noise");
    }
}

public static class Cat extends Pet{
        public Cat(String nickname, int age, int trickLevel, Set<String>habits) {
            super(nickname, age, trickLevel, habits);
        }

    public Cat(String nickname) {
            this.nickname=nickname;
    }

    @Override
    public void speak() {
        System.out.println("Cat is mewoing");
    }

    @Override
    public void play() {
        System.out.println("Can play with anybody");
    }

    @Override
    public void respond() {
        System.out.println("does not respond");
    }

}
  public static class RoboCat extends Pet{
      public RoboCat(String nickname, int age, int trickLevel, Set<String>habits) {
          super(nickname, age, trickLevel, habits);
      }

      public RoboCat() {
      super(Species.ROBOCAT);
      }

      public RoboCat(String roboKitty) {
      }

      public void speak(){
          System.out.println("I am a RoboCat");
      }
      public void play() {
          System.out.println("RoboCat is playing with laser lights.");
      }

      @Override
      public void respond() {
          System.out.println("RoboCat uses commands to answer.");
      }
  }
  public void eat(){
        System.out.println(nickname + "is eating.");
    }
    public enum Species {
        UNKNOWN(0, false, false),
        CAT(4, false, true),
        DOG(4, false, true),
        BIRD(2, true, true),
        FISH(0, false, false),
        DOMESTICCAT(4, false, true),
        ROBOCAT(2, false, true),
        MONKEY(2, false, true);


        public int trickLevel;
        private int numberOfLegs;
        private boolean canFly;
        private boolean hasFur;


        Species(int numberOfLegs, boolean canFly, boolean hasFur) {
            this.numberOfLegs = numberOfLegs;
            this.canFly = canFly;
            this.hasFur = hasFur;
        }

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public boolean canFly() {
            return canFly;
        }

        public boolean hasFur() {
            return hasFur;

        }



    }
    public Pet(String nickname) {

        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel) {

        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;

    }

    public Pet(Set<String> habits) {
        this.habits = habits;
    }

    public Pet() {
    }

    public  Species getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = Species.valueOf(species);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }





    interface Foul{
        void foul();
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }



    @Override
    public boolean equals(Object o) {
      if(this==o){
          return true;
      }
      if(o==null||getClass()!=o.getClass()){
          return false;
      }
      Pet pet=(Pet)o;
      return  age==pet.age&&
              trickLevel==pet.trickLevel&&
              Objects.equals(nickname, pet.nickname)&&
              Objects.equals(species, pet.species)&&
              Objects.equals(habits, pet.habits);


    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, habits);
    }

    protected void finalize() throws Throwable {
        try {

        } finally {

            super.finalize();
        }
    }
}