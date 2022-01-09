package fr.esgi.archi_logicielle_cc2;

import fr.esgi.archi_logicielle_cc2.kernel.*;
import fr.esgi.archi_logicielle_cc2.myApp.application.*;
import fr.esgi.archi_logicielle_cc2.myApp.domain.UserRepository;
import fr.esgi.archi_logicielle_cc2.myApp.infrastructure.DefaultEventDispatcher;
import fr.esgi.archi_logicielle_cc2.myApp.infrastructure.InMemoryUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class LocalConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public EventDispatcher<Event> eventEventDispatcher() {
        final Map<Class<? extends Event>, List<EventListener<? extends Event>>> listenerMap = new HashMap<>();
        listenerMap.put(CreateContractorEvent.class, List.of(new CreateContractorEventListener()));
        listenerMap.put(CreateTradesmanEvent.class, List.of(new CreateTradesmanEventListener()));
        return new DefaultEventDispatcher(listenerMap);
    }

    @Bean
    public CreateContractorCommandHandler createContractorCommandHandler() {
        return new CreateContractorCommandHandler(userRepository(), eventEventDispatcher());
    }

    @Bean
    public CreateTradesmanCommandHandler createTradesmanCommandHandler() {
        return new CreateTradesmanCommandHandler(userRepository(), eventEventDispatcher());
    }

    @Bean
    public CommandBus commandBus() {
        final Map<Class<? extends Command>, CommandHandler> commandHandlerMap = new HashMap<>();
        commandHandlerMap.put(CreateContractor.class, new CreateContractorCommandHandler(userRepository(), eventEventDispatcher()));
        commandHandlerMap.put(CreateTradesman.class, new CreateTradesmanCommandHandler(userRepository(), eventEventDispatcher()));
        return new SimpleCommandBus(commandHandlerMap);
    }

}
