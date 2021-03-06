package demo.todo.eclipselink;

import act.db.CreatedAt;
import act.db.LastModifiedAt;
import act.db.jpa.util.TimestampAuditor;

import java.util.Date;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(TimestampAuditor.class) // We must manually add this here as eclipselink read bytecode directly from file
public class ModelBase {

    @CreatedAt
    private Date created;

    @LastModifiedAt
    private Date lastModified;

    public Date getCreated() {
        return created;
    }

    public Date getLastModified() {
        return lastModified;
    }

}
