package br.dev.universos.act.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String description; 
    
    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;    

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String phone;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;    
}
