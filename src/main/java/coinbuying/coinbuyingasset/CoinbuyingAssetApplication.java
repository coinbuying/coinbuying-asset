package coinbuying.coinbuyingasset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CoinbuyingAssetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinbuyingAssetApplication.class, args);
	}

}
