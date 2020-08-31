package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jantonio on 30/08/2020.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Word";
    }
}
