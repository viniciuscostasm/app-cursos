/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.util;

import br.ba.cimatec.acad.dao.CursoDAO;
import br.ba.cimatec.acad.dao.CursoDAOListener;

/**
 *
 * @author ITAMARA
 */
public class FabricaDAO {
    
    public static CursoDAOListener criarCursoDAO(){
        CursoDAO cDAO = new CursoDAO();
        cDAO.setSessao(HibernateUtil.getSessionFactory().openSession());
        return cDAO;
    }
}
