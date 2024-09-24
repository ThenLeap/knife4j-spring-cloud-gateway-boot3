package teck.jony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.jony.filter.EnableGatewayCommunication;
import tech.jony.filter.EnableInnerCommunication;

// TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
@SpringBootApplication
@EnableGatewayCommunication
public class UserServiceApplication {

    // http://localhost:9002/user/doc.html
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
