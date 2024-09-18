package audit;

import javax.persistence.*;

import config.CustomRevisionListener;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(name = "revision_seq", sequenceName = "rback.seq_revison_id")
    @RevisionNumber
    private int id;
    @Column(name= "REVISION_INFO")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date fecha;
}
