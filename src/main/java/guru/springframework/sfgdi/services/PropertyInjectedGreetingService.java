package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jantonio on 31/08/2020.
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
