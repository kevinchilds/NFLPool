package dev.kevinchilds.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "picks")
public class Pick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id_fk", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "poolsheet_id_fk", nullable = false)
    private PoolSheet sheet;
}
