package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepo englishGreetingRepo;

    public I18nEnglishGreetingService(EnglishGreetingRepo englishGreetingRepo) {
        this.englishGreetingRepo = englishGreetingRepo;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
