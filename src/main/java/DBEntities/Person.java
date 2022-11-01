package DBEntities;

import DBEntities.Interfaces.Contactable;

// This is the base class of all Persons.
// All Persons must be contactable, so this class includes the Contactable interface, but without
// a concrete implementation, for which the more specific subclasses of Person must provide a concrete
// implementation. It is therefore an abstract class

public abstract class Person implements Contactable {
    protected String name;
    protected String contactNum;

    public Person(String name){
        this.name=name;
    }

}
