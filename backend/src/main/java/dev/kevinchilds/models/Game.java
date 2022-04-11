package dev.kevinchilds.models;

import java.util.Date;

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
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "game_date", nullable = false)
    private Date gameDate;
    
    @Column(name = "home_team", nullable = false)
    private String homeTeam;


    @Column(name = "away_team", nullable = false)
    private String awayTeam;

    @Column(name = "betting_on", nullable = false)
    private String bettingOn;

    @ManyToOne
    @JoinColumn(name = "pick_id_fk", nullable = false)
    private Pick pick;
}
