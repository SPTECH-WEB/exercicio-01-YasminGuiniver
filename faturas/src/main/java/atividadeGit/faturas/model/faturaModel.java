package atividadeGit.faturas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class faturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve conter exatamente 16 dígitos numéricos")
    private String numeroCartao;


    @Size(min = 3, max = 100, message = "O nome do titular deve ter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull
    @DecimalMin(value = "10.00", message = "O valor mínimo permitido é 10.00")
    @DecimalMax(value = "5000.00", message = "O valor máximo permitido é 5000.00")
    private Double valor;


    @FutureOrPresent(message = "A data do pagamento deve ser no presente ou futuro")
    private LocalDate dataPagamento;


    @Email(message = "O email deve ser válido")
    private String emailContato;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}
