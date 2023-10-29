package com.app.taskit.mapItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MapService {
    private final MapRepository mapRepository;

    @Autowired
    public MapService(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }

    public List<MapItem> getMaps() {
        return mapRepository.findAll();
    }

    public Optional<MapItem[]> getMapsByColor(String color) {
        return mapRepository.findMapByColor(color);
    }

//    public void addNewMap(MapItem mapItem){
//        Optional<MapItem[]> mapByColor = mapRepository
//                .findMapByColor(mapItem.getColor());
//        if (mapByColor.isEmpty()){
//            mapRepository.save(mapItem);
//        }else {
//            throw new IllegalStateException("Name already exists");
//        }
//
//    }
//            return List.of(new Student(1L,"Patrik","Dian", LocalDate.of(2002, Month.MAY,5),21));

}
