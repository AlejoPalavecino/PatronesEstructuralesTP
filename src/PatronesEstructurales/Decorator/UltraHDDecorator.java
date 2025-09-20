package PatronesEstructurales.Decorator;

public class UltraHDDecorator extends PlanDecorator{

    public UltraHDDecorator(Plan plan){
        super(plan);
    }

    @Override
    public int getCosto(){
        return super.getCosto() + 1000;
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion() + " + UltraHD";
    }

}
