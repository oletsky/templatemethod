package javatraining.oletsky.demotemplatemethod;

public abstract class TemplateMethodClass {
    public final void performComplexOperation() {
        //Part 1 - this should be done necessarily
        System.out.println("Necessary part");
        part2();

    }
//How to ban direct call of this function?
    abstract public void part2();
}
