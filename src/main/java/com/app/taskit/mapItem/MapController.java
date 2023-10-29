package com.app.taskit.mapItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/maps")
public class MapController {

    private final MapService mapService;
    @Autowired
    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping
    public List<MapItem> getMaps() {
        return mapService.getMaps();
    }

    @GetMapping("{id}")
    public Optional<MapItem[]> getMapByColor(@PathVariable String id) {
        return mapService.getMapsByColor(id);
    }

//    @PostMapping
//    public void registerNewMap(@RequestBody MapItem mapItem){
//        mapService.addNewMap(mapItem);
//    }

}
