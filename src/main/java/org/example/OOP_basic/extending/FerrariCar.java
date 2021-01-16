package org.example.OOP_basic.extending;

public class FerrariCar extends SportCar {
    private String modelName;

    public FerrariCar(int accelerationTo100, String modelName)
    {
       super(accelerationTo100);
        this.modelName = modelName;
    }
    public String getModelName(){
        return modelName;
    }

    @Override
    public String getColor(){
        return "ferrari is always red";
    }

    public  String getColor(String addon)
    {
        return "ferrari is of color "+addon;
    }

    public String getOriginalColor(){
        return super.getColor();
    }

}
