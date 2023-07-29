import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Random;

public class Family implements Human.HumanCreator {
    private Human parent1;
    private Human mother;
    private Human father;
    private Human parent2;
    private Human[] children;
    private Pet pet;


    private int childCount;
    private int maxChildren;
    private Human[] familyMembers;
    private int numberofMembers;


    private String motherName;
    private String fatherName;
    private ArrayList<Human> childrenName;
    private Human child;

    public Family(ArrayList<Human> childrenName) {
        this.childrenName = childrenName;
    }

    public Family(String motherName) {
        this.motherName = motherName;
    }




    public Family(Human parent1, Human parent2, int maxChildren) {
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.maxChildren = maxChildren;
        this.children = new Human[maxChildren];
        this.childCount = 0;


    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getParent1() {
        return parent1;
    }

    public void setParent1(Human parent1) {
        this.parent1 = parent1;
    }

    public Human getParent2() {
        return parent2;
    }

    public void setParent2(Human parent2) {
        this.parent2 = parent2;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getMaxChildren() {
        return maxChildren;
    }

    public void setMaxChildren(int maxChildren) {
        this.maxChildren = maxChildren;
    }


    @Override
    public String toString() {
        return "Family{" +
                "parent1=" + parent1 +
                ", mother=" + mother +
                ", father=" + father +
                ", parent2=" + parent2 +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                ", childCount=" + childCount +
                ", maxChildren=" + maxChildren +
                '}';
    }

    public void addChildren(Human child) {
        if (childCount < children.length) {
            children[childCount] = this.child;
            childCount++;
        } else {
            System.out.println("No children added.");
        }
    }

    public void removeChildren(Human child) {
        boolean removed = false;
        for (int i = 0; i < childCount; i++) {
            if (children[i].equals(child)) {
                // Shift remaining children to fill the gap
                for (int j = i; j < childCount - 1; j++) {
                    children[j] = children[j + 1];
                }
                children[childCount - 1] = null;
                childCount--;
                return;
            }
        }
        System.out.println("Child not found in the family.");

        if (removed) {

            System.out.println(child.getName() + " removed from children.");
        } else {

            System.out.println(child.getName() + " not found in children array.");
        }
    }

    public int countFamily() {
        int count = 0;
        for (int i = 0; i < numberofMembers; i++) {
            if (!familyMembers[i].equals(mother) && familyMembers[i].equals(father)) {
                count++;
            }
        }
        return count;
    }


    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        System.arraycopy(children, index + 1, children, index, children.length - index - 1);
        children = Arrays.copyOf(children, children.length - 1);

        return true;
    }


    public Human[] getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Human[] familyMembers) {
        this.familyMembers = familyMembers;
    }

    @Override
    public Human bornChild(String fatherName, String motherName, double motherIQ, double fatherIQ, String name, int age) {
        Random random = new Random();
        String childName = getRandomName();
        double averageIQ = (motherIQ + fatherIQ) / 2;
        boolean isMale = random.nextBoolean();

        Human child;
        if (isMale) {
            child = new Human.Man(childName, averageIQ);
        } else {
            child = new Human.Woman(childName, averageIQ);
        }
        addChildren(child);
        return child;
    }

    private String getRandomName() {
  
        String[] names = {"John", "Jane", "Michael", "Emily", "Robert", "Sophia"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

static {
            System.out.println("Family is being loaded");
        }

    {
        System.out.println("A new family is created");

    }
        public boolean equals(Object o){
            if(this==o)
                return true;
            if(o==null||getClass()!=o.getClass())
                return false;
            Family family1= (Family) o;
            return  Objects.equals(family1.father, father)&& Objects.equals(family1.mother, mother)&& Arrays.equals(family1.familyMembers, familyMembers);


    }
    public int hashCode(){
     int result =Objects.hash(father, mother, pet);
     result = 31*result +Arrays.hashCode(children);
        result = 31*result +Arrays.hashCode(familyMembers);
        return result;
    }

    protected void finalize() throws Throwable {
        try {

        } finally {

            super.finalize();
        }
    }
    }
