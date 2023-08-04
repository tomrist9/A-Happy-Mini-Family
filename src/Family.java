import java.util.*;

public class Family implements Human.HumanCreator {
    private Human parent1;
    private Human mother;
    private Human father;
    private Human parent2;
    private List<Human> children;
    private Set<Pet> pet =new HashSet<>();


    private int childCount;
    private int maxChildren;
    private List<Human> familyMembers;
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
        this.children = new List<Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Human> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Human human) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Human> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Human> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Human get(int index) {
                return null;
            }

            @Override
            public Human set(int index, Human element) {
                return null;
            }

            @Override
            public void add(int index, Human element) {

            }

            @Override
            public Human remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Human> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Human> listIterator(int index) {
                return null;
            }

            @Override
            public List<Human> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.childCount = 0;


    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new List<Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Human> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Human human) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Human> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Human> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Human get(int index) {
                return null;
            }

            @Override
            public Human set(int index, Human element) {
                return null;
            }

            @Override
            public void add(int index, Human element) {

            }

            @Override
            public Human remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Human> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Human> listIterator(int index) {
                return null;
            }

            @Override
            public List<Human> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
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


    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    private int getChildCount() {
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
                ", children=" + children +
                ", pet=" + pet +
                ", childCount=" + childCount +
                ", maxChildren=" + maxChildren +
                ", familyMembers=" + familyMembers +
                ", numberofMembers=" + numberofMembers +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", childrenName=" + childrenName +
                ", child=" + child +
                '}';
    }


    public void addChildren(Human child) {
        if (childCount < children.size()) {
            children.set(childCount, this.child);
            childCount++;
        } else {
            System.out.println("No children added.");
        }
    }

    public void removeChildren(Human child) {
        boolean removed = false;
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).equals(child)) {
                // Remove the child from the list
                children.remove(i);
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
            if (!familyMembers.get(i).equals(mother) && familyMembers.get(i).equals(father)) {
                count++;
            }
        }
        return count;
    }


    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size()) {
            return false;
        }

       children.remove(index);

        return true;
    }


    public List<Human> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<Human> familyMembers) {
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


    protected void finalize() throws Throwable {
        try {

        } finally {

            super.finalize();

        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return childCount == family.childCount && maxChildren == family.maxChildren && numberofMembers == family.numberofMembers && Objects.equals(parent1, family.parent1) && Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(parent2, family.parent2) && Objects.equals(children, family.children) && Objects.equals(pet, family.pet) && Objects.equals(familyMembers, family.familyMembers) && Objects.equals(motherName, family.motherName) && Objects.equals(fatherName, family.fatherName) && Objects.equals(childrenName, family.childrenName) && Objects.equals(child, family.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent1, mother, father, parent2, children, pet, childCount, maxChildren, familyMembers, numberofMembers, motherName, fatherName, childrenName, child);
    }
}