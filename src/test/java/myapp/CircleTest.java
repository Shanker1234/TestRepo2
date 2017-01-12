package myapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.shan.myapp.model.Circle;

public class CircleTest {
    
    @Test
    public void verifySetId() {
        int id= 2;
        Circle circle = new Circle();
        circle.setId(2);
        assertEquals(id, circle.getId());
    }

}
