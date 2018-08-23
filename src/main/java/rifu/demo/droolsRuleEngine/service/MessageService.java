package rifu.demo.droolsRuleEngine.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rifu.demo.droolsRuleEngine.pojo.Message;
import rifu.demo.droolsRuleEngine.ruleAction.SayHiRule;

@Service
public class MessageService {

    @Autowired
    KieContainer kieContainer;

    public void processMessage(Message message) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("out", System.out);
        kieSession.setGlobal("sayHiRule", SayHiRule.getInstance());
        kieSession.insert(message);
        kieSession.fireAllRules();

    }

}
