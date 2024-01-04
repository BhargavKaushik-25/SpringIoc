package EnginePackage;

public class PetrolEngine implements Engine
{

    @Override
    public void getEngineInformation() {
        System.out.println("ENGINE PRICE IS :- 49999.99");
    }

    @Override
    public void getEngineType() {
        System.out.println("ENGINE TYPE IS :- PETROL");
    }
}
