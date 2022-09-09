package br.com.htapp.database.entity.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EVENTO")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "BANDEIRA")
    private String bandeira;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DATA_REGISTRO")
    private LocalDateTime dataRegistro;
}