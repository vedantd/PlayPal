package com.vedantd.playpal.model;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sport sport;
    private String skillLevel;
    @ManyToOne(fetch = FetchType.LAZY)
    private User host;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<User> participants = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    private Venue venue;
    private LocalDateTime dateTime;
    private BigDecimal price;
    @Column(length = 2048)
    private String additionalInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Event() {
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", sport=" + sport +
                ", skillLevel='" + skillLevel + '\'' +
                ", host=" + host +
                ", participants=" + participants +
                ", venue=" + venue +
                ", dateTime=" + dateTime +
                ", price=" + price +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}