/**
 * 
 */
package spear.of.ares.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:30:15 - 25/04/2023
 *
 */
@Configuration
public class UserDetailServiceConfig {
	
	@Value("${userDetail.name}")
	private String USER_NAME;
	@Value("${userDetail.pass}")
	private String USER_PASS;
	@Value("${adminDetail.name}")
	private String ADMIN_NAME;
	@Value("${adminDetail.pass}")
	private String ADMIN_PASS;
	
    @Bean
    protected UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername(USER_NAME)
          .password(bCryptPasswordEncoder.encode(USER_PASS))
          .roles("USER")
          .build());
        manager.createUser(User.withUsername(ADMIN_NAME)
          .password(bCryptPasswordEncoder.encode(ADMIN_PASS))
          .roles("ADMIN", "USER")
          .build());
        return manager;
    }

    @Bean
    protected BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
