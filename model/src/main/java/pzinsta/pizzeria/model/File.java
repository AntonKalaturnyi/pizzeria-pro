package pzinsta.pizzeria.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

//++
@Entity
public class File implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @NotNull
    @Column(unique = true, name = "fileName")
    private String name;

    @NotNull
    private String contentType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
