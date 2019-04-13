package pavanjdot.com.sportsapp

class Sport {

    var sportName: String? = null
    var sportDetails: String? = null
    var sportImgae: Int? = null

    constructor(name: String, details: String, image: Int){

        sportName = name
        sportDetails = details
        sportImgae = image
    }
}