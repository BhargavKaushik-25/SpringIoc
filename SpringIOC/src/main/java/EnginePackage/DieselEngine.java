package EnginePackage;

public class DieselEngine implements Engine
{

    @Override
    public void getEngineInformation() {
        System.out.println("ENGINE PRICE IS :-39999.99");
    }

    @Override
    public void getEngineType() {
        System.out.println("ENGINE TYPE IS :- DIESEL");
    }
}
