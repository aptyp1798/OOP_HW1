import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int year;
    private Person mother;
    private Person father;
    private List<Person> childrenList;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
        this.childrenList = new ArrayList<>();
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return year;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getChildrenList() {
        return childrenList;
    }

    public void addChild(Person child) {
        this.childrenList.add(child);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year && Objects.equals(name, person.name) && Objects.equals(mother, person.mother) && Objects.equals(father, person.father) && Objects.equals(childrenList, person.childrenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, mother, father, childrenList);
    }
}
