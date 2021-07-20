package br.com.felipemarchant.controledeestoque.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne(cascade = { CascadeType.MERGE })
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne(cascade = { CascadeType.MERGE })
    private Empresa empresa;
    @ManyToOne(cascade = { CascadeType.MERGE })
    private NivelAcesso nivelAcesso;
    @ManyToOne(cascade = { CascadeType.MERGE })
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDate inicioJornada;
    private LocalDate fimJornada;
}
