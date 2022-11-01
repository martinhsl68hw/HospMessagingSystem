package DBEntities.Interfaces;

// Any entity class implementing this interface must implement the contact method to send a message to that entity
public interface Contactable {
    void contact(String msg);
}
