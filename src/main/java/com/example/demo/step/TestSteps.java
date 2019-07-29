package com.example.demo.step;
import com.example.demo.AbstractDefs;
import com.example.demo.bean.StaticData;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSteps extends AbstractDefs {

    @Autowired
    private StaticData staticData;

    @Given("^Generate testCase for$")
    public void generateTestCase() {
        String aaa=staticData.getFilePath();
        System.out.println("hello amei");
    }

}
