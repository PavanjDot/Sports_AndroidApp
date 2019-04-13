package pavanjdot.com.sportsapp

class SportDatabase {

    var sports: ArrayList<Sport>? = null


    constructor() {

        sports = ArrayList()

        sports?.add(Sport("Boxing", "Boxing is a combat sport in which two people " +
                "usually wearing protective gloves " +
                "throw punches at each other for a predetermined set of time", R.drawable.boxing))

        sports?.add(Sport("Wrestling", "Wrestling is a combat sport involving grappling type " +
                "techniques such as clinch fighting, throws and takedowns, joint locks " +
                "pins and oather grappling holds", R.drawable.wrestling))

        sports?.add(Sport("Crossfit", "Crossfit is a branded fitness regimen created " +
                "by Gred Glassman and is a registered trademark of CrossFit, Inc. ", R.drawable.crossfit))

        sports?.add(Sport("Karate", "Karate is a martial art Developed in " +
                "the Ryukyu Kingdom ", R.drawable.karate))

        sports?.add(Sport("Football", "Association football, more commonly known as" +
                "football or soccre, is a team sport played betwqeen " +
                "two teams of eleven players with a spherical ball", R.drawable.football))

        sports?.add(Sport("Judo", "Judo was created as " +
                "a Physical, mental and moral pedagogy in Japan " +
                "in 1882, by Jigoro Kano. ", R.drawable.jiujitsu))
    }
}