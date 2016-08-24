package visitor;

/**
 * Created by androidjp on 16/8/19.
 */
public class Test {
    public static void main(String[] args) {
        Visitor visitorA = new CEOVisitor();
        Visitor visitorB = new CTOVisitor();

        Staff staffA = new Coder("Android开发工程师小明");
        Staff staffB = new Coder("Android开发工程师小美");
        Staff staffC = new PM("产品助理小潘");
        Staff staffD = new PM("产品助理小红");

        staffA.accept(visitorA);
        staffB.accept(visitorA);
        staffC.accept(visitorA);
        staffD.accept(visitorA);
        staffA.accept(visitorB);
        staffB.accept(visitorB);
        staffC.accept(visitorB);
        staffD.accept(visitorB);
    }
}
