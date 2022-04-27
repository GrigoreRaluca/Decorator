package ro.ase.cts.Decorator;

public class MasinaClasica implements InterfaceMasina{
private boolean okmotor;

    public MasinaClasica(boolean okmotor) {
        this.okmotor = okmotor;
    }

    public boolean isOkmotor() {
        return okmotor;
    }

    public void setOkmotor(boolean okmotor) {
        this.okmotor = okmotor;
    }

    @Override
    public void pornesteMotor(boolean okmotor) {
        if(okmotor)
            System.out.println("Motor pornit");
        else
            System.out.println("Motor oprit");

    }
}
