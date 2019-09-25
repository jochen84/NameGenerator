package SE.EC.Johan.NameGenerator.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NameServiceTest{

    NameReader testObject;

    @Before
    public void setUp() {
        testObject = new NameReader();
    }


    @Test
    public void file_succesfully_to_boyNameList(){

        int expected = 19499;
        int actual = testObject.pojkNamn().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void file_succesfully_to_girlNameList(){

        int expected = 19391;
        int actual = testObject.flickNamn().size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void file_succesfully_to_lastNameList(){

        int expected = 100;
        int actual = testObject.efterNamn().size();

        Assert.assertEquals(expected,actual);

    }

}
