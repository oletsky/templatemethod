package javatraining.oletsky.demotemplatemethod;

public class TemplateMethodClient {
    public static void main(String[] args) {
        TemplateMethodClass ekz = new TemplateSubClass();
        ekz.performComplexOperation();
        //ekz.part2(); How to ban this?
    }
}
