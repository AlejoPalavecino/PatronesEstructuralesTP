package PatronesEstructurales.Decorator;

public class PlanBasico implements Plan {
    @Override
    public int getCosto(){
        return 1000;
    }

    @Override
    public String getDescripcion(){
        return "Plan Basico";
    }
}
