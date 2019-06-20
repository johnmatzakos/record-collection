package com.recordcollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
//import org.springframework.context.ApplicationContext;

/**
 * Created by Ioannis Matzakos on 22/03/2019.
 */

@SpringBootApplication
@EntityScan("com.recordcollection")
public class RecordCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordCollectionApplication.class, args);
		//ApplicationContext ctx = SpringApplication.run(RecordCollectionApplication.class, args);
	}

}
