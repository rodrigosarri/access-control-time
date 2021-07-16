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

public class Movement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private Users users;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
    @Column(nullable = false)    
    private Date dateEntry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
    @Column(nullable = false)    
    private Date exitDate;

    @Column(nullable = false)
    private Integer stayPeriod;

    @ManyToOne()
    private Occurrence occurrence;

    @ManyToOne()
    private Calendar calendar;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;     

}
