package br.com.felipemarchant.controledeestoque.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @NoArgsConstructor
    @Getter
    @Setter
    public static class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }

    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal salarioHoras;
}
