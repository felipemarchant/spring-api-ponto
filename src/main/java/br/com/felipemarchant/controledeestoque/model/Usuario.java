package br.com.felipemarchant.controledeestoque.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDate inicioJornada;
    private LocalDate fimJornada;
}
