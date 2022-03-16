package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepoImpl implements EnglishGreetingRepo {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
