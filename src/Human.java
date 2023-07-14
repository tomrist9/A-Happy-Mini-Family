public class Human {
    public String name;
    public String surname;
    public int yearOfBirth;
    public int IQ;

    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet(){
        System.out.println("Hello"+pet.nickname);
    }

    public void describePet(){
        String petDescription="I have a"+pet.species+", he is "+ pet.age+"years old, he is ";
        if(pet.trickLevel>50){
            petDescription+="very sly";
        }else{
            petDescription+="almost not sly";

        }
        System.out.println(petDescription);
    }
}


//    Describe Human with the following fields:
//        (name)
//        (surname)
//        date of birth (year), number
//        IQ level (iq) (a whole number from 1 to 100))
//        (pet) (object type Pet)
//        (mother) (object type Human)
//        (father) (object type Human)
//        Schedule of non-working activities (schedule) (2d array: [day of the week] x [type of the activity])
//        Describe and implement the following methods for Human:
//        (greetPet)("Hello, [the name of the pet]")
//        (describePet): (display the information about your pet: "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".