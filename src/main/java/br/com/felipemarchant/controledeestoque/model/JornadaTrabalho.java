package br.com.felipemarchant.controledeestoque.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class JornadaTrabalho {
    private long id;
    private String descricao;
}
