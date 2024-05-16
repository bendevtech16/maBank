package cm.bankBack;


import entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repository.UserRepository;



@SpringBootApplication
public class BankBackApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankBackApplication.class, args);
	}
	/*@Bean
	 CommandLineRunner commandLineRunner( UserRepository userRepository){
		return args -> {
			User user = new User().builder()
					.userId(123)
					.userName("francois xavier")
					.userEmail("fancois237@gmail.com")
					.userAdress("Toulouse, France rue 124A")
					.build();
					userRepository.save(user);
			User user2 = new User().builder()
					.userName("jean pierre")
					.userEmail("georgejean@gmail.com")
					.userAdress("Douala, camerroun rue 365")
					.build();
					userRepository.save(user2);
			User user3 = new User().builder()
					.userName("alexis james")
					.userEmail("jamesalexis@gmail.com")
					.userAdress("paris, France rue mainitoba 365")
					.build();
					userRepository.save(user3);
			User user4 = new User().builder()
					.userName("dupond moretty")
					.userEmail("dupondKamdjou@gmail.com")
					.userAdress("Buea, Cameroun rue john mba 365BA")
					.build();
			userRepository.save(user3);
		};
	}*/
}
