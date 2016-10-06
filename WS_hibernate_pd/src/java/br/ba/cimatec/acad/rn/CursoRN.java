/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.rn;

import br.ba.cimatec.acad.dao.CursoDAOListener;
import br.ba.cimatec.acad.mapeamento.Curso;
import br.ba.cimatec.acad.mapeamento.Elemento;
import br.ba.cimatec.acad.mapeamento.Subelemento;
import br.ba.cimatec.acad.util.FabricaDAO;
import java.util.List;

/**
 *
 * @author andre
 */
public class CursoRN {
    CursoDAOListener cDao;

    public CursoRN() {
        cDao = FabricaDAO.criarCursoDAO();
    }

    
    public Curso consultarCursoPorID(Integer id) {
        return this.cDao.consultarCursoPorID(id);
    }

    
    public List<Elemento> listarElementosPorCurso(Integer idcurso) {
        return this.cDao.listarElementosPorCurso(idcurso);
    }

    
    public List<Subelemento> listarSubElementosPorCurso(Integer idcurso) {
        return this.cDao.listarSubElementosPorCurso(idcurso);
    }

    
    public List<Subelemento> listarSubElementosPorElemento(Integer idelemento) {
        return this.cDao.listarSubElementosPorElemento(idelemento);
    }

    
    public List<Curso> listarTodosCursos() {
        return this.cDao.listarTodosCursos();
    }
    
    
}
