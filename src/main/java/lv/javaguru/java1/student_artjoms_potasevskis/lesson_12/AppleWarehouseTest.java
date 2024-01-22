package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

class AppleWarehouseTest {


    @Test
public void shouldFindGreenApples(){

AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findGreenApples();
        Assert.assertEquals(greenApples.size(), 3);
        Assert.assertEquals(greenApples.get(0).getColor(), "green");
        Assert.assertEquals(greenApples.get(1).getColor(), "green");
        Assert.assertEquals(greenApples.get(2).getColor(), "green");
    }
    @Test
    public void shouldFindRedApples(){

        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findGreenApples();
        Assert.assertEquals(redApples.size(), 3);
        Assert.assertEquals(redApples.get(0).getColor(), "red");
        Assert.assertEquals(redApples.get(1).getColor(), "red");
        Assert.assertEquals(redApples.get(2).getColor(), "red");
    }
    @Test
    public void shouldFindYellowApples(){

        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findGreenApples();
        Assert.assertEquals(redApples.size(), 3);
        Assert.assertEquals(redApples.get(0).getColor(), "red");
        Assert.assertEquals(redApples.get(1).getColor(), "red");
        Assert.assertEquals(redApples.get(2).getColor(), "red");
    }

}
