package PatronesEstructurales.Decorator;

public class OfflineDecorator extends PlanDecorator{

    public OfflineDecorator(Plan plan){
        super(plan);
    }

    @Override
    public int getCosto(){
        return super.getCosto() + 700;
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion() + " + Desacargas Offline";
    }

}
