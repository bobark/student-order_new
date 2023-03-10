package edu.javacourse.studentorder.dao;


import edu.javacourse.studentorder.domain.CountryArea;
import edu.javacourse.studentorder.domain.PassportOffice;
import edu.javacourse.studentorder.domain.RegisterOffice;
import edu.javacourse.studentorder.domain.Street;
import edu.javacourse.studentorder.exception.DaoException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

public class DictionaryDaoImpTest {

    @BeforeClass
    public static void startUp() throws Exception {
        DBInit.startUp();
    }

    @Test
    public void testStreet() throws DaoException {
        List<Street> d = new DictionaryDaoImp().findStreet("про");
        Assert.assertTrue(d.size() == 2);
    }

    @Test
    public void testPassportOffice() throws DaoException {
        List<PassportOffice> po = new DictionaryDaoImp().findPassportOffice("010020000000");
        Assert.assertTrue(po.size() == 2);
    }

    @Test
    public void testRegisterOffice() throws DaoException {
        List<RegisterOffice> ro = new DictionaryDaoImp().findRegisterOffice("010010000000");
        Assert.assertTrue(ro.size() == 2);
    }

    @Test
    public void testArea() throws DaoException {
        List<CountryArea> co1 = new DictionaryDaoImp().findArea("");
        Assert.assertTrue(co1.size() == 2);
        List<CountryArea> co2 = new DictionaryDaoImp().findArea("020000000000");
        Assert.assertTrue(co2.size() == 2);
        List<CountryArea> co3 = new DictionaryDaoImp().findArea("020010000000");
        Assert.assertTrue(co3.size() == 2);
        List<CountryArea> co4 = new DictionaryDaoImp().findArea("020010010000");
        Assert.assertTrue(co4.size() == 2);
    }


}