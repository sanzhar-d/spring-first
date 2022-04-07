package kg.megacom.firstSpringProject.services.impl;

import kg.megacom.firstSpringProject.models.GoodBye;
import kg.megacom.firstSpringProject.models.Greeting;
import kg.megacom.firstSpringProject.services.GoodByeService;
import kg.megacom.firstSpringProject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodByeServiceImpl implements GoodByeService {

    @Autowired
    private GreetingService greetingService;

    @Override
    public GoodBye save() {

        Greeting greeting = greetingService.save();

        return new GoodBye(1L, "Пока", greeting);
    }
}
