package com.pluralsight;

public class GamePlay {
    public static void main(String[] args) {
        Moped myMoped = new Moped();
        myMoped.setSpeed(35);
        myMoped.setModel("Vespa");
        myMoped.setSideCar(true);
        System.out.println("My moped is a " + myMoped.getModel() + " and has a high speed of " + myMoped.getSpeed() + ". It has a side car? "
                + myMoped.isSideCar() + "\n");

        Car myCar = new Car();
        myCar.setMake("Lexus");
        myCar.setModel("Rx300");
        myCar.setNumberOfPassengers(5);
        System.out.println("My car, Debora, is a " + myCar.getMake() + " " + myCar.getModel() + " and she seats " + myCar.getNumberOfPassengers() + " people. \n ");

        SemiTruck mySemi = new SemiTruck();
        mySemi.setSleeperCab(true);
        mySemi.setBreakingDistance(150);
        mySemi.setTrailerType("basic trailer");
        mySemi.setCargoCapacity(4000);
        System.out.println("My semi has a " + mySemi.getTrailerType() + " with a cargo capacity of " + mySemi.getCargoCapacity() + "lbs. To avoid collision, brake at "
                + mySemi.getBreakingDistance() + "ft.\n" + "There is a sleeper cab? " + mySemi.isSleeperCab() + "\n" );

        Hovercraft myHover = new Hovercraft();
        myHover.setHoverAltitude(4);
        myHover.setSpeed(500);
        myHover.setTractionMechanic("boosted repulsor");
        myHover.setDamagePercentage(100.00);
        System.out.println("My land-speeder is an X-34 with a " + myHover.getTractionMechanic() + ", reaches speeds of up to " +myHover.getSpeed() + "mpm, hovers at "
        + myHover.getHoverAltitude() + "ft, and a durability of " +myHover.getDamagePercentage() + "% \n ");


        SwampBoat myBoat = new SwampBoat();
        myBoat.setFishingFeature("lobster cage");
        myBoat.setCargoType("lobsters");
        myBoat.setColor("rusty");
        System.out.println("My boat is a " + myBoat.getColor() + " color, and transports lots and lots of "
                + myBoat.getCargoType() + ", and has many " + myBoat.getFishingFeature() + "s.");

    }

}
