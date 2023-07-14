public class Human {
    public String name;
    public String surname;
    public int yearOfBirth;
    public int IQ;

    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    // Constructor to describe the name, surname, date of birth, father, and mother
    public Human(String name, String surname, int yearOfBirth, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.father = father;
        this.mother = mother;
    }







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

    public String toString(){
        return "Human{name=' "+ name+", surname=' "+surname+"year="+yearOfBirth+",iq= "+ IQ+", mother="+mother +", father="+father+"pet="+pet+"{nickname='"+ pet.nickname+" ', age="+ pet.age+", trickLevel="+ pet.trickLevel+", habits="+ pet.habits+"}";
    }
}

