package br.usp.poli.magnodb.model.dao;

import br.usp.poli.magnodb.model.Produto;
import br.usp.poli.magnodb.model.dao.config.DAOSetUp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gustavo on 28/11/16.
 */
public class ProdutoDAOTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void cadastrarProduto() throws Exception {
        Produto p = new Produto("leite", "tem no melk.no");
        DAOSetUp.testSetUp();;

        ProdutoDAO dao = ProdutoDAO.getInstance();
        dao.cadastrarProduto(p);
    }

}