package DBEntities.Interfaces;
// Any entity class implementing this interface must implement the whereAmI method to locate that entity in the hospital
public interface Locatable {
    String whereAmI();
}
