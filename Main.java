import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Person john = new Person("John", 1950);
        Person alis = new Person("Alis", 1990);
        Person boy = new Person("Boy", 1995);
        Person mary = new Person("Mary", 1954);

        alis.setFather(john);
        alis.setMother(mary);
        boy.setFather(john);
        boy.setMother(mary);

        john.addChild(boy);
        john.addChild(alis);
        mary.addChild(boy);
        mary.addChild(alis);

        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(alis);
        familyTree.addPerson(mary);

        List<Person> johnChildren = familyTree.getChildren(john);
        for (Person child : johnChildren) {
            System.out.println("John child: " + child.getName());
        }

        List<Person> brotherAlis = familyTree.getBrotherSister(alis);
        for (Person brSis : brotherAlis) {
            System.out.println("Alis brother or sister: " + brSis.getName());
        }
    }
}
