package baza;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Table(name = "zdjecie")
public class Photo extends AbstractEntity {
    @NotNull
    private String photoUrl;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
