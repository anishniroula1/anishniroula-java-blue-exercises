package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int racconsPlayingInWood=3;
        int racconsThatLeft=2;
        int racconsRemaining = racconsPlayingInWood-racconsThatLeft;
        System.out.println(racconsRemaining);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int numberOfFlower = 5;
        int numberOfBees = 3;
        int lessBeesThanFlower = numberOfFlower - numberOfBees;
        System.out.println(lessBeesThanFlower);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int lonelyPigeionEating = 1;
        int anotherPigeonJoin = 1;
        int pigeonTogetherEating = lonelyPigeionEating + anotherPigeonJoin;
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int owlSittingOnFence = 3;
        int owlJoinToSit = 2;
        int ownOnFence = owlSittingOnFence + owlJoinToSit;

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        int beaverWorkingAtHome = 2;
        int beaverWentToSwim = 1;
        int atHomeStillWorking = beaverWorkingAtHome - beaverWentToSwim;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        int toucansSittingOnTreeLimp = 2;
        int toucansJoinToSit = 1;
        int totalSittingOnTreeLimp = toucansSittingOnTreeLimp + toucansJoinToSit;
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int squirrelsOnTree = 4;
        int squirrelsWithNuts = 2;
        int squirrelsWithoutNuts = squirrelsOnTree - squirrelsWithNuts;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        int quarter = 25;
        int oneDime = 10;
        int twoNickels = 5 + 5;
        int totalMoney = quarter + oneDime + twoNickels;
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int mrsBrierClassBakesMuffin = 18;
        int mrsMacAdamsClassBakesMuffin = 20;
        int mrsFlanneryClassBakesMuffin = 17;
        int totalFirstClassBakesMuffin = mrsBrierClassBakesMuffin + mrsMacAdamsClassBakesMuffin + 
        		mrsFlanneryClassBakesMuffin;
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int mrsHiltYoyoCost = 24;
        int mrsHiltWhistleCost = 14;
        int totalMoneySpendInCent = mrsHiltYoyoCost + mrsHiltWhistleCost;
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarshmallows= 8;
        int miniMarshmallows =10;
        int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows;
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int mrsHiltsnow = 29;
        int mrsBrecknockSnow = 17;
        int moreSnowMrsHiltHave = mrsHiltsnow - mrsBrecknockSnow;
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int mrsHiltMoney = 10;
        int spendOnToyTruck = 3;
        int spendOnPencil = 2;
        int totalMoneyLeft = mrsHiltMoney - spendOnToyTruck - spendOnPencil;
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int totalMarbles = 16;
        int lostMarbles = 7;
        int remainingMarbles = totalMarbles - lostMarbles;
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int currentSeashells = 19;
        int NeedSeashells = 6;
        int totalSeashells = currentSeashells + NeedSeashells;
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradTotalBallons = 17;
        int redBallon = 8;
        int greenBallons = bradTotalBallons - redBallon;
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnTheShelf = 38;
        int addedBookOnTheShelf = 10;
        int totalBookOnTheShelf = booksOnTheShelf + addedBookOnTheShelf;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int oneBeeLegs = 6;
        int numberOfBee = 8;
        int totalBeesLegs = oneBeeLegs * numberOfBee;
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double iceCreanConeCost = 0.99;
        int iceCreamConeNeeded = 2;
        double costForCones = iceCreanConeCost * iceCreamConeNeeded;
        System.out.println(costForCones);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksMrsHiltHave = 64;
        int rocksMrsHiltNeeded = 125;
        int rocksNeedToCompleteGarden = rocksMrsHiltNeeded - rocksMrsHiltHave;
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int marbleMrsHiltHad = 38;
        int marblesMrsHiltLost = 15;
        int leftMarbles = marbleMrsHiltHad - marblesMrsHiltLost;
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int totalMilesToConcert = 78;
        int milesDrivenTillGasStop = 32;
        int remainingMiles = totalMilesToConcert - milesDrivenTillGasStop;
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int shovelingSnowSaturdayMorning = 90; //its in minutes
        int shovelingSnowSaturdayAfternoon = 45; 
        int totaltime = shovelingSnowSaturdayMorning + shovelingSnowSaturdayAfternoon;
        int minutesInHour = 60;
        double inHourFormat = (double) totaltime/ minutesInHour;
        System.out.println("It took her " + inHourFormat +" hours");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int numberOgHotDogs = 6;
        double eachHotDogCost = 0.50;
        double totalCostForHotDogs = numberOgHotDogs * eachHotDogCost;
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int totalMoneyInCents = 50;
        int eachPencilCostInCents = 7;
        int totalPencilSheBought = totalMoneyInCents / eachPencilCostInCents;
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterflies = 33;
        int orangeButerFlies = 20;
        int redButterflies = totalButterflies - orangeButerFlies;
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double kateGiveClerk = 1.0;
        double candyCost = 0.54;
        double changeKateGot =  kateGiveClerk - candyCost;
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int backyardTrees = 13;
        int WantToPlant = 12;
        int totalPlantsMarkWillHave = backyardTrees + WantToPlant;
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int joySeesGrandmaInDays = 2;
        int hoursInDay = 24;
        int hoursUntilJoySeesGrandma = joySeesGrandmaInDays * hoursInDay;
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int kimTotalCousin = 4;
        int piecesOfGumToEach = 5;
        int gumNeeded = kimTotalCousin * piecesOfGumToEach;
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double danMoney =3.0;
        double boughtCandy = 1.0;
        double RemainingMoney = danMoney - boughtCandy;

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int totalBoatinLake = 5;
        int peopleInEachBoat = 3;
        int numbersofPeopleOnBoatInLake =totalBoatinLake * peopleInEachBoat;
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int totalLegos = 380;
        int lostlegos = 57;
        int legosLeft = totalLegos - lostlegos;
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int bakedMuffins = 35;
        int haveToBakeToReach = 83;
        int needtoBake = haveToBakeToReach - bakedMuffins;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willyCrayonsMoreThanLucy = willyCrayons - lucyCrayons;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersOnaPage = 10;
        int numberOfPages = 22;
        int totalStickers = stickersOnaPage * numberOfPages;
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int numberOfCubcakes = 96;
        int numberOfChildren = 8;
        int equallyShareCupcakes = numberOfCubcakes / numberOfChildren;
        System.out.println(equallyShareCupcakes);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalGingerBreakCookies = 47;
        int equallyDistributeinGlassJars = 6; 
        int notPlacedinJars = totalGingerBreakCookies % equallyDistributeinGlassJars;
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59;
        int numberofNeighbours = 8;
        int croissantsSharedEqully = totalCroissants / numberofNeighbours;
        int leftWithMarian = totalCroissants % numberofNeighbours;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int numberOfOatmealsCookies = 276;
        int cookiesOnTrayAtaTime= 12;
        int traysNeedtobake = numberOfOatmealsCookies / cookiesOnTrayAtaTime;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int totalBiteSizedPretzels = 480;
        int oneServingPretzels = 12;
        int totalServingPrepared = totalBiteSizedPretzels / oneServingPretzels;
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int bakedLemonCupcakes = 53 ;
        int oneBoxContains = 3 ;
        int cupcakesLeftAtHome = 2 ;		
        int totalCupcakes= bakedLemonCupcakes - cupcakesLeftAtHome ;
        int cupcakesGivenAway= totalCupcakes / oneBoxContains ;
        System.out.println(cupcakesGivenAway) ;
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticks = 74;
        int numberOfPeople = 12;
        int uneatenCarrot = carrotSticks % numberOfPeople ;
        System.out.println(uneatenCarrot);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalTeddyBears = 98;
        int numberOfBearsShelfCanHold = 7;
        int shelvesFilled = totalTeddyBears / numberOfBearsShelfCanHold;
        System.out.println(shelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int numberOfPictures = 480;
        int picturesAlbumCanContain = 20;
        int albumsNeeded = numberOfPictures / picturesAlbumCanContain;
        System.out.println(albumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int tradingCards = 94;
        int aFullBoxHold = 8;
        int numberOfBoxesFilled = tradingCards/aFullBoxHold;
        int numberOfCardsInUnfilledBox = tradingCards % aFullBoxHold;
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int numberOfBooks = 210;
        int bookShelves = 10;
        int eachShelfContain = numberOfBooks / bookShelves;
        System.out.println(eachShelfContain);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int bakedCroissants = 17;
        int serveEquallyToGuest = 7;
        float croissantsGuestGot = (float)bakedCroissants / serveEquallyToGuest;
        System.out.println(croissantsGuestGot);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined 
        hourly rate of the painters.Challenge: How many days will it take the pair to paint 623 rooms assuming they work 
        8 hours a day?.
        */
        // I will be using this math Formula (a*b)/(a+b)
        double billPaintingTime = 2.15;
        double jillPaintingTime = 1.90;
        double timeWhenWorkingTogether = (billPaintingTime*jillPaintingTime)/
        		(billPaintingTime+jillPaintingTime);
        double timeTwoPainterTookToPainFiveRoom = 5 * timeWhenWorkingTogether;
        System.out.println("It took them "+ timeTwoPainterTookToPainFiveRoom + " Hours.");
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
        String firstName = "Anish ";
        String middleName = "K";
        String lastName = "Niroula";
        System.out.println(lastName +", "+firstName+middleName + ".");

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
        int totalMilesToTravel = 800;
        int trainHasTravelled = 537;
        int percentageValue = 100;
        double percentageOfTripCompleted = (percentageValue *trainHasTravelled)/totalMilesToTravel;
        System.out.println("The Train has travelled "+percentageOfTripCompleted + " Percentage");

	}

}
