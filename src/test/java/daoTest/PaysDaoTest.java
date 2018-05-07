/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoTest;

import dao.PaysDao;
import domaine.Pays;
import domaine.Skieur;
import java.io.FileReader;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

/**
 *
 * @author maret
 */
public class PaysDaoTest {
    
    private PaysDao dao;
    private FileReader reader;
    private Pays pays;
    private Skieur skieur;
    
    
    @BeforeTest
    public void init() {
    
    }
    
    
    
}
