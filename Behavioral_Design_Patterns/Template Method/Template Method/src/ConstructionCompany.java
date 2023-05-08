public abstract class ConstructionCompany {

    final  public  void prepareHouse (){


        System.out.println("prepare Start ....");
        this.BuildingTheWalls();
        this.roofConstruction();
        this.BuildingDoorsAndWindows();
        this.BuildingSwimmingPools();
        this.GarageConstruction();
        this.BuildFarm();

        System.out.println("Done Construction .....");
    }


    abstract protected  void GarageConstruction();

    abstract  protected  void BuildingSwimmingPools();

    abstract protected void BuildFarm();

      protected void BuildingTheWalls (){

        System.out.println("Walls have been built");
      }

      protected void  roofConstruction (){

        System.out.println("The roof is built");
      }

      protected void BuildingDoorsAndWindows (){

        System.out.println("Doors and windows have been built");
      }

}
