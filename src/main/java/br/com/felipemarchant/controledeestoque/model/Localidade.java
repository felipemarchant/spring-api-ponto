package br.com.felipemarchant.controledeestoque.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
