public class countryHouse extends ConstructionCompany{
    @Override
    protected void GarageConstruction() {

        System.out.println("Not built Garage");
    }

    @Override
    protected void BuildingSwimmingPools() {

        System.out.println("Swimming pool is built");

    }

    @Override
    protected void BuildFarm() {

        System.out.println("The farm is built");
    }
}
