package SpringIoc;

public class Projector implements Machine{
    @Override
    public void getMachineInformation() {
        System.out.println("PROJECTOR IS A MACHINE");
    }

    @Override
    public void getMachinePrice() {
        System.out.println("PROJECTOR PRICE IS 2999.99 Rs");
    }
}
