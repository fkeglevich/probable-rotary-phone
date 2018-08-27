package prp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensagem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cidade;
    private String mensagem;

    protected Mensagem() {}

    public Mensagem(String nome, String cidade, String mensagem) {
        this.nome = nome;
        this.cidade = cidade;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return String.format(
                "Mensagem[id=%d, nome='%s', cidade='%s', mensagem='%s']",
                id, nome, cidade, mensagem);
    }

}