package com.vedantd.playpal.repository;


import com.vedantd.playpal.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
    List<Venue> findByLocation(String location);
    List<Venue> findByRatingGreaterThanEqual(double rating);
    List<Venue> findByNameContaining(String name);
    List<Venue> findByEventsDateTimeAfter(LocalDateTime dateTime);

}
