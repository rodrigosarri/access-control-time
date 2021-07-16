package br.dev.universos.act.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private UserCategory userCategory;
    
    @ManyToOne(optional = false)
    private Company company;

    @ManyToOne(optional = false)
    private AccessLevel accessLevel;

    @ManyToOne(optional = false)
    private WorkingDay workingDay;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer tolerance;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
    @Column(nullable = false)
    private Date startTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
    @Column(nullable = false)
    private Date endTime;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;      

}
