package com.codurance.skeleton;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    Belly belly = new Belly();

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly.eat(cukes);
    }

}
