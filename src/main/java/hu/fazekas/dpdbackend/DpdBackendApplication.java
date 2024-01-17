package hu.fazekas.dpdbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class DpdBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpdBackendApplication.class, args);
        System.out.println(SpringVersion.getVersion());
    }

}
