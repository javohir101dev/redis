package java101.redisspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Product") // for storing hashes in redis
public class Product implements Serializable {

    @Id
    private int id;
    private String name;
    private int quantity;
    private long price;

}
