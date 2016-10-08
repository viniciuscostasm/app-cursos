/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.mapeamento;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "curso_id")
    private Integer cursoId;
    @Size(max = 200)
    @Column(name = "curso_nome")
    private String cursoNome;
    @Size(max = 500)
    @Column(name = "curso_descricao")
    private String cursoDescricao;
    @Size(max = 20)
    @Column(name = "curso_turno")
    private String cursoTurno;
    @Size(max = 60)
    @Column(name = "curso_modalidade")
    private String cursoModalidade;
    @Size(max = 200)
    @Column(name = "curso_coordenador")
    private String cursoCoordenador;
    @Size(max = 200)
    @Column(name = "curso_duracao")
    private String cursoDuracao;
    @Column(name = "curso_avaliacao_mec")
    private Integer cursoAvaliacaoMec;
    @Column(name = "curso_mensalidade")
    private Double cursoMensalidade;
    @Size(max = 50)
    @Column(name = "curso_status")
    private String cursoStatus;
    @Size(max = 100)
    @Column(name = "curso_categoria")
    private String cursoCategoria;
    
    public Curso() {
    }

    public Curso(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public String getCursoDescricao() {
        return cursoDescricao;
    }

    public void setCursoDescricao(String cursoDescricao) {
        this.cursoDescricao = cursoDescricao;
    }

    public String getCursoStatus() {
        return cursoStatus;
    }

    public void setCursoStatus(String cursoStatus) {
        this.cursoStatus = cursoStatus;
    }

    public String getCursoCategoria() {
        return cursoCategoria;
    }

    public void setCursoCategoria(String cursoCategoria) {
        this.cursoCategoria = cursoCategoria;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cursoId);
        hash = 23 * hash + Objects.hashCode(this.cursoNome);
        hash = 23 * hash + Objects.hashCode(this.cursoDescricao);
        hash = 23 * hash + Objects.hashCode(this.cursoStatus);
        hash = 23 * hash + Objects.hashCode(this.cursoCategoria);
        hash = 23 * hash + Objects.hashCode(this.cursoAvaliacaoMec);
        hash = 23 * hash + Objects.hashCode(this.cursoTurno);
        hash = 23 * hash + Objects.hashCode(this.cursoMensalidade);
        hash = 23 * hash + Objects.hashCode(this.cursoModalidade);
        hash = 23 * hash + Objects.hashCode(this.cursoCoordenador);
        hash = 23 * hash + Objects.hashCode(this.cursoDuracao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.cursoNome, other.cursoNome)) {
            return false;
        }
        if (!Objects.equals(this.cursoDescricao, other.cursoDescricao)) {
            return false;
        }
        if (!Objects.equals(this.cursoStatus, other.cursoStatus)) {
            return false;
        }
        if (!Objects.equals(this.cursoCategoria, other.cursoCategoria)) {
            return false;
        }
        if (!Objects.equals(this.cursoId, other.cursoId)) {
            return false;
        }
        if (!Objects.equals(this.cursoTurno, other.cursoTurno)) {
            return false;
        }
        if (!Objects.equals(this.cursoModalidade, other.cursoModalidade)) {
            return false;
        }
        if (!Objects.equals(this.cursoAvaliacaoMec, other.cursoAvaliacaoMec)) {
            return false;
        }
        if (!Objects.equals(this.cursoCoordenador, other.cursoCoordenador)) {
            return false;
        }
        if (!Objects.equals(this.cursoDuracao, other.cursoDuracao)) {
            return false;
        }
        if (!Objects.equals(this.cursoMensalidade, other.cursoMensalidade)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "br.ba.cimatec.acad.mapeamento.Curso[ cursoId=" + cursoId + " ]";
    }

    /**
     * @return the cursoTurno
     */
    public String getCursoTurno() {
        return cursoTurno;
    }

    /**
     * @param cursoTurno the cursoTurno to set
     */
    public void setCursoTurno(String cursoTurno) {
        this.cursoTurno = cursoTurno;
    }

    /**
     * @return the cursoModalidade
     */
    public String getCursoModalidade() {
        return cursoModalidade;
    }

    /**
     * @param cursoModalidade the cursoModalidade to set
     */
    public void setCursoModalidade(String cursoModalidade) {
        this.cursoModalidade = cursoModalidade;
    }

    /**
     * @return the cursoCoordenador
     */
    public String getCursoCoordenador() {
        return cursoCoordenador;
    }

    /**
     * @param cursoCoordenador the cursoCoordenador to set
     */
    public void setCursoCoordenador(String cursoCoordenador) {
        this.cursoCoordenador = cursoCoordenador;
    }

    /**
     * @return the cursoDuracao
     */
    public String getCursoDuracao() {
        return cursoDuracao;
    }

    /**
     * @param cursoDuracao the cursoDuracao to set
     */
    public void setCursoDuracao(String cursoDuracao) {
        this.cursoDuracao = cursoDuracao;
    }

    /**
     * @return the cursoAvaliacaoMec
     */
    public Integer getCursoAvaliacaoMec() {
        return cursoAvaliacaoMec;
    }

    /**
     * @param cursoAvaliacaoMec the cursoAvaliacaoMec to set
     */
    public void setCursoAvaliacaoMec(Integer cursoAvaliacaoMec) {
        this.cursoAvaliacaoMec = cursoAvaliacaoMec;
    }

    /**
     * @return the cursoMensalidade
     */
    public Double getCursoMensalidade() {
        return cursoMensalidade;
    }

    /**
     * @param cursoMensalidade the cursoMensalidade to set
     */
    public void setCursoMensalidade(Double cursoMensalidade) {
        this.cursoMensalidade = cursoMensalidade;
    }
    
}
