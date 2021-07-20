package br.com.felipemarchant.controledeestoque.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = { CascadeType.MERGE })
    private NivelAcesso nivelAcesso;
    private String descricao;
}
