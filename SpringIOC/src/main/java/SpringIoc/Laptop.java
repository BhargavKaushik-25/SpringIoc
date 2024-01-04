package SpringIoc;

public class Laptop implements Machine{
    @Override
    public void getMachineInformation() {
        System.out.println("LAPTOP NAME IS LENOVO YOGA TAB");
        System.out.println("PROCESSOR IS i5 7th GENERATION");
    }

    @Override
    public void getMachinePrice() {
        System.out.println("LAPTOP PRICE IS 45000Rs");
    }
}
