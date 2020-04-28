package javatraining.oletsky.demotemplatemethod;

/**
 * @author O.Oletsky
 * How to refactor this so that sublasses may change the realization
 * of the Part 2
 */
public class InitialClass {
    public void performComplexOperation() {
        //Part 1 - this should be done necessarily
        System.out.println("Necessary part");
        //Part 2 - this is up to subclasses
        System.out.println("Subclasses may define this operation");
    }
}
