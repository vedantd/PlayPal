package com.vedantd.playpal.repository;

import com.vedantd.playpal.model.Event;
import com.vedantd.playpal.model.Sport;
import com.vedantd.playpal.model.User;
import com.vedantd.playpal.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findBySport(Sport sport);
    List<Event> findBySkillLevel(String skillLevel);
    List<Event> findByHost(User host);
    List<Event> findByParticipantsContains(User participant);
    List<Event> findByVenue(Venue venue);
    List<Event> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
    List<Event> findByParticipantsIn(Set<User> participants);
    List<Event> findByPriceLessThanEqual(BigDecimal price);
    List<Event> findByAdditionalInfoContaining(String keyword);

}