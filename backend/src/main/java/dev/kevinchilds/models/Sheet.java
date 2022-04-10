package dev.kevinchilds.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;



///incomplete
public class Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer weekNumber;
    private Date startDate;
    private Date endDate;

    private List<String> picks = new ArrayList<>();


    @ManyToOne
    private Pool pool;

}
