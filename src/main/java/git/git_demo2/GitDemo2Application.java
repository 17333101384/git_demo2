package git.git_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitDemo2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GitDemo2Application.class, args);
        System.out.println("hello git!");
        System.out.println("hello git!");
        System.out.println("hello git!");
        System.out.println("master test!");
        System.out.println("push !");

    }

}
