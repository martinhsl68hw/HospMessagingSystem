public abstract class Person {
    protected String name;
    protected String contactNum;

    public Person(String name){
        this.name=name;
    }
    protected abstract void contact(String msg);
}
