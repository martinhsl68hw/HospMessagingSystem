package DBEntities;

import DBEntities.Interfaces.Contactable;

public abstract class Person implements Contactable {
    protected String name;
    protected String contactNum;

    public Person(String name){
        this.name=name;
    }

}
