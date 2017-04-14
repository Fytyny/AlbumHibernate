package baza;

import javax.persistence.*;
import java.util.List;
@Entity
public class Folder extends AbstractEntity {
    @Column(name = "nazwa", unique = true, nullable = false)
    private String name;
    @OneToMany
    @JoinColumn(name = "folderid")
    private List<Album> albums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
