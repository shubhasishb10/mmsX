package org.thp.mmsX.domain;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
public class Role implements Serializable {
    @Serial
    private static final long serialVersionUID = 501003025808112908L;
    // Role population

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToMany(mappedBy = "roles")
    private List<Individual> individuals;
}
