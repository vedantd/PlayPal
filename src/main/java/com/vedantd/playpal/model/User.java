package com.vedantd.playpal.model;


import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    @Column(length = 60) // bcrypt hashing
    private String passwordHash;
    private String profileImageUrl;
    private String phoneNumber;
    @Embedded
    private Address address;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_skills", joinColumns = @JoinColumn(name = "user_id"))
    @MapKeyColumn(name = "sport_name")
    @Column(name = "skill_level")
    private Map<String, String> skillLevels;

    // When storing skillLevels map in the database, a separate table (user_skills) is used to hold
    // this data where a column named sport_name, which stores the keys of the map
    // (sport names), and another column (specified by @Column(name = "skill_level")) stores the
    // values (skill levels).
    // The @ElementCollection annotation ensures that this data is associated with the User entity.


    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", skillLevels=" + skillLevels +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getSkillLevels() {
        return skillLevels;
    }

    public void setSkillLevels(Map<String, String> skillLevels) {
        this.skillLevels = skillLevels;
    }
}