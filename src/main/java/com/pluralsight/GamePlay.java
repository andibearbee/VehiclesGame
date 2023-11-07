package com.pluralsight;

public class GamePlay {
    public static void main(String[] args) {
        Moped myMoped = new Moped("Bouncy Tires Upgrade", "Lime Green","Survival Packs", "REV 36000", 65, 8, 7, 2, 80, .6, .2, "Vespa", "Razor 2", true );
        myMoped.setSpeed(35);
        myMoped.setModel("Vespa");
        myMoped.setSideCar(true);
        System.out.println("My moped is a " + myMoped.getModel() + " and has a high speed of " + myMoped.getSpeed() + ". It has a side car? "
                + myMoped.isSideCar() + "\n");

        Car myCar = new Car("Good Year Tires", "Black", "Cakes", "Standard", 185,  6 , 16, 5, 400, 0.8, .8, "Lexus", "Rx300", "SUV");
        myCar.setMake("Lexus");
        myCar.setModel("Rx300");
        myCar.setNumberOfPassengers(5);
        System.out.println("My car, Debora, is a " + myCar.getMake() + " " + myCar.getModel() + " and she seats " + myCar.getNumberOfPassengers() + " people. \n ");

        SemiTruck mySemi = new SemiTruck("Spike Treads Upgrade", "Fire Engine Red", "Weapons of Mass Destruction", "Monster Munch Upgrade", 200, 4, 38, 3, 12000, .2 , 1.5, 563, "XL Transport Trailer", true);
        mySemi.setSleeperCab(true);
        mySemi.setBrakingDistance(150);
        mySemi.setTrailerType("basic trailer");
        mySemi.setCargoCapacity(4000);
        System.out.println("My semi has a " + mySemi.getTrailerType() + " with a cargo capacity of " + mySemi.getCargoCapacity() + "lbs. To avoid collision, brake at "
                + mySemi.getBrakingDistance() + "ft.\n" + "There is a sleeper cab? " + mySemi.isSleeperCab() + "\n" );

        Hovercraft myHover = new Hovercraft("Triple Boosted Repulsor", "Tattooine Orange", "Droids and Harvested Moisture", "Refurbished Pod Racer ZM3", 700, 9, 92, 6, 1150, .7, 2.4, 4);
        myHover.setHoverAltitude(4);
        myHover.setSpeed(500);
        myHover.setTractionMechanic("boosted repulsor");
        myHover.setDamagePercentage(100.00);
        System.out.println("My land-speeder is an X-34 with a " + myHover.getTractionMechanic() + ", reaches speeds of up to " +myHover.getSpeed() + "mpm, hovers at "
        + myHover.getHoverAltitude() + "ft, and a durability of " +myHover.getDamagePercentage() + "% \n ");


        SwampBoat myBoat = new SwampBoat("creaky metal fan", "swamp green", "gators", "putty propeller", 45, 5, 42, 8, 900, .95, .47, "basic canopy", "gator cage" );
        myBoat.setFishingFeature("gator cage");
        myBoat.setCargoType("gators");
        myBoat.setColor("swamp green");
        System.out.println("My boat is a " + myBoat.getColor() + " color, and transports lots and lots of "
                + myBoat.getCargoType() + ", and has many " + myBoat.getFishingFeature() + "s.");

    }

}
