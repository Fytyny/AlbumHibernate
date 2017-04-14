package baza;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Album extends AbstractEntity {
    private String title;
    private String author;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @NotNull
    @OneToMany
    @JoinColumn(name = "albumid")
    private List<Photo> photos;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /*
    @PrePersist
    protected void onCreate() {
        date = new Date();
    }
    */

}