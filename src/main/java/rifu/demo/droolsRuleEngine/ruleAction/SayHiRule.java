package rifu.demo.droolsRuleEngine.ruleAction;

public class SayHiRule {
    public static SayHiRule sayHiRule = null;

    public static SayHiRule getInstance() {
        if (sayHiRule == null) {
            sayHiRule = new SayHiRule();
        }
        return sayHiRule;
    }

    public String sayHi(String name) {
        return name + " hi!";
    }
}
