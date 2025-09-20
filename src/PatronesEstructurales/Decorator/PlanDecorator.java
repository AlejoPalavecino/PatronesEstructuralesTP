package PatronesEstructurales.Decorator;

abstract class PlanDecorator implements Plan {
    protected Plan plan;

    public PlanDecorator(Plan plan){
        this.plan = plan;
    }

    @Override
    public int getCosto(){
        return plan.getCosto();
    }

    @Override
    public String getDescripcion(){
        return plan.getDescripcion();
    }

}
