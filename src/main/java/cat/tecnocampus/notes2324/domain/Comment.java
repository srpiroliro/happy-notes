package cat.tecnocampus.notes2324.domain;

import cat.tecnocampus.notes2324.configuration.TsidUtils;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// TODO 3.1 You need to complete this class
@Entity
public class Comment {
    @Id
    private long id;
    private String title;
    private String body;

    // TODO 3.1.1 there is a relationship between comments and notes. You need to complete the relationship
    @ManyToOne
    @JoinColumn(name="note_id", nullable=false)
    private Note note;

    public Comment() {
        id = TsidUtils.getTsidFactory(1).generate().toLong();
    }

    public Comment(String title, String body) {
        id = TsidUtils.getTsidFactory(1).generate().toLong();
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // TODO 3.1.2 you need to complete the following methods
    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
