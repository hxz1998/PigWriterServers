package org.pigwriter.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@GenericGenerator(name = "uuid", strategy = "uuid")
public class Article {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String title;
    private String content;
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}