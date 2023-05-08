public class houseInTheCity extends ConstructionCompany{
    @Override
    protected void GarageConstruction() {

        System.out.println("The garage has been built");
    }

    @Override
    protected void BuildingSwimmingPools() {

        System.out.println("Not built Swimming Pools");

    }

    @Override
    protected void BuildFarm() {

        System.out.println("Not built Farm");

    }
}
