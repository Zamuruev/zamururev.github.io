package prod.psgm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prod.psgm.dtos.UserDTO;
import prod.psgm.services.interfaces.UserSerivce;

import java.util.ArrayList;
import java.util.List;

@Component
public class Init implements CommandLineRunner {
    private final UserSerivce userSerivce;

    @Autowired
    public Init(UserSerivce userSerivce){
        this.userSerivce = userSerivce;
    }

    @Override
    public void run(String... args) throws Exception {
        UserDTO user1 = new UserDTO();
        user1.setFirstName("Сидорина");
        user1.setMiddleName("Кристина");
        user1.setRole("ROLE_TUTOR");
        user1.setUrlPhoto("/img/tutors/kris.png");
        /*List<String> universities1 = new ArrayList<>();
        universities1.add("РГГУ");
        universities1.add("НИЯУ МИФИ");
        universities1.add("МАИ");
        universities1.add("ВАВТ");
        universities1.add("МГАВМиБ");
        universities1.add("РГГУ");
        universities1.add("МосПолиТех");
        universities1.add("МТУСИ");
        universities1.add("РУТ (МИИТ)");
        universities1.add("РУДН");
        universities1.add("МГЛУ");
        user1.setUniversities(universities1);*/
        userSerivce.addUser(user1);
        UserDTO user2 = new UserDTO();
        user2.setFirstName("Мирзоян");
        user2.setMiddleName("Карина");
        user2.setRole("ROLE_TUTOR");
        user2.setUrlPhoto("/img/tutors/car.png");
        userSerivce.addUser(user2);

        UserDTO user3 = new UserDTO();
        user3.setFirstName("Седых");
        user3.setMiddleName("Никита");
        user3.setRole("ROLE_TUTOR");
        user3.setUrlPhoto("/img/tutors/nik.png");
        userSerivce.addUser(user3);

        UserDTO user4 = new UserDTO();
        user4.setFirstName("Казинская");
        user4.setMiddleName("Елизавета");
        user4.setRole("ROLE_TUTOR");
        user4.setUrlPhoto("/img/tutors/lis.png");
        userSerivce.addUser(user4);
    }
}
