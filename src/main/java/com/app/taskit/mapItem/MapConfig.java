package com.app.taskit.mapItem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class MapConfig {
    @Bean
    CommandLineRunner commandLineRunner(MapRepository repository){
        return args -> {
            MapItem m1 = new MapItem(227,"Yekky","00:21.997","Jet.","zrMI7C9d2kE","white");
            MapItem m2 = new MapItem(230,"SmithyTM","00:16.781","Buuuuurd","GYX1AYKcnp8","white");
            MapItem m3 = new MapItem(247,"dooैl ᄓ boost","00:28.629","dazzzyy","Nm-1-TGRIg4","red");
            MapItem m4 = new MapItem(230,"SmithyTM","00:16.781","Buuuuurd","GYX1AYKcnp8","white");
            MapItem m5 = new MapItem(230,"SmithyTM","00:16.781","Buuuuurd","GYX1AYKcnp8","white");
            repository.saveAll(List.of(m1,m2,m3));
        };
    }
}
