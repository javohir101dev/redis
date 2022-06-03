package java101.redisspring;

import java101.redisspring.entity.Product;
import java101.redisspring.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class RedisSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringApplication.class, args);
    }


}
