package io.github.WegielWBucie.Notes.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "NOTE_GROUPS")
public class NoteGroup extends BaseNote {

//    @Embedded
//    @AttributeOverrides({
//                    @AttributeOverride(column = @Column(name = "updatedOn"), name = "updatedOn")
//            }
//    )
//    private Audit audit = new Audit();

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "group"
    )
    private Set<Note> notes;

    public Set<Note> getNotes() {
        return notes;
    }

    void setNotes(final Set<Note> notes) {
        this.notes = notes;
    }
}
