/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.dao;

import br.ba.cimatec.acad.mapeamento.Curso;
import br.ba.cimatec.acad.mapeamento.Elemento;
import br.ba.cimatec.acad.mapeamento.Subelemento;
import java.util.List;

/**
 *
 * @author andre
 */
public interface CursoDAOListener {

    Curso consultarCursoPorID(Integer id);

    List<Elemento> listarElementosPorCurso(Integer idcurso);

    List<Subelemento> listarSubElementosPorCurso(Integer idcurso);

    List<Subelemento> listarSubElementosPorElemento(Integer idelemento);

    List<Curso> listarTodosCursos();
    
}
