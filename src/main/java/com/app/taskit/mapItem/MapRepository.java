package com.app.taskit.mapItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MapRepository extends JpaRepository<MapItem, Long> {

    @Query("SELECT s from MapItem s WHERE  s.color = ?1")
    Optional<MapItem[]> findMapByColor(String color);
}
