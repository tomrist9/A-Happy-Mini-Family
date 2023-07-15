public class Main {
    public static void main(String[] args) {
        Human father1 = new Human("John", "Doe", 1970);
        Human mother1 = new Human("Jane", "Doe", 1975);
        Human child1 = new Human("Alex", "Doe", 1995, father1, mother1);
        Pet pet1 = new Pet("Dog", "Buddy");

        // Assigning father and mother to family1

        Human family1 = new Human("Alex", "Doe", 1995, 112, pet1 , father1, mother1, new String[][]{new String[]{"eat; runs"}});


        System.out.println("Father:");
        System.out.println(father1.toString());
        System.out.println("Mother:");
        System.out.println(mother1.toString());
        System.out.println("Child:");
        System.out.println(child1.toString());
        System.out.println("Pet:");
        System.out.println(pet1.toString());
        System.out.println("Family 1:");
        System.out.println(family1.toString());

        Human father2 = new Human("David", "Smith", 1982);
        Human mother2 = new Human("Emily", "Smith", 1985);
        Human child2 = new Human("Olivia", "Smith", 2010, father2, mother2);
        Pet pet2 = new Pet("Cat", "Whiskers", 2, 52, new String[]{"eat; runs"});
        System.out.println("\nFamily 2:");
        System.out.println(father2.toString());
        System.out.println(mother2.toString());
        System.out.println(child2.toString());
        System.out.println(pet2.toString());

        child1.describePet();
        if (child1.pet != null) {
            child1.pet.eat();
            child1.greetPet();
            child1.pet.response();
            child1.pet.foul();

        }
    }
}
