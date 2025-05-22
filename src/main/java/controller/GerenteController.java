package controller;

import dao.GerenteDao;
import model.Gerente;

public class GerenteController extends FuncionarioController {

    private GerenteDao gerenteDao;

    public GerenteController() {
        this.gerenteDao = new GerenteDao();
    }

    public void cadastrarGerente(Gerente gerente) {
        gerenteDao.inserir(gerente);
    }

    // Pode adicionar métodos específicos no futuro
}
