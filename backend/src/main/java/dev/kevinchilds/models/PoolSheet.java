package dev.kevinchilds.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "poolsheets")
public class PoolSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_of_first_game", nullable = false)
    private Date dateOfFirstGame;

    @Column(name = "date_of_last_game", nullable = false)
    private Date dateOfLastGame;


    @Column(name = "created_date", nullable = false)
    private Date dateCreated;

    @ManyToOne
    @JoinColumn(name = "pool_id_fk", nullable = false)
    private Pool pool;
}
