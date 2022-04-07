package kg.megacom.firstSpringProject.services.impl;

import kg.megacom.firstSpringProject.models.Greeting;
import kg.megacom.firstSpringProject.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting save() {
        return new Greeting(2L, "Привет!");
    }
}
