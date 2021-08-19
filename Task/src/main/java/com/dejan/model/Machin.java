package com.dejan.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Machin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "uid", nullable = false)
    private String uid;
    @Column(name = "createdBy", nullable = false)
    private Long createdBy;
    @Column(name = "createdAt", nullable = false)
    private Date createdAt;
    private boolean activ;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    public Machin(String uid, Long createdBy, Date createdAt, boolean activ, User user) {
        this.uid =
                uid;
        this.createdBy =
                createdBy;
        this.createdAt =
                createdAt;
        this.activ =
                activ;
        this.user =
                user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =
                id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid =
                uid;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy =
                createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt =
                createdAt;
    }

    public boolean isActiv() {
        return activ;
    }

    public void setActiv(boolean activ) {
        this.activ =
                activ;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user =
                user;
    }

    @Override
    public String toString() {
        return "Machin{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", createdBy=" + createdBy +
                ", createdAt=" + createdAt +
                ", activ=" + activ +
                ", user=" + user +
                '}';
    }
}
