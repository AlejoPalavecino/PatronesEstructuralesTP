package PatronesEstructurales.Decorator;

public class HDDecorator extends PlanDecorator{

    public HDDecorator(Plan plan){
        super(plan);
    }

    @Override
    public int getCosto(){
        return super.getCosto() + 500;
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion() + " + HD";
    }
}
