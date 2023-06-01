package com.example.BiograpyApp.services

import com.example.BiograpyApp.models.Gallery

class GalleryService {

    fun galleryResult(): List<Gallery> {
        val resultList = mutableListOf<Gallery>()

        val g1 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/9162d2e1-2d0b-47e4-84bf-7102762570aa","Salda Lake, Burdur, Turkey", "03/06/2018", "Lake Salda is a mid-size crater lake in southwestern Turkey, within the boundaries of Yeşilova district of Burdur Province. It lies at a distance of about fifty kilometers to the west from the province seat Burdur.")
        val g2 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/61c801ff-de6e-4f5a-94d3-78623b42f9f2", "Gölyazı, Bursa, Turkey", "07/09/2017", "Gölyazı is a Turkish town founded on a small peninsula on Lake Uluabat. Gölyazı was founded by the Ancient Greeks. but remains of the Roman period are abundant. Every year the town holds the Stork Festival and until the 20th century, Greeks and Manavs lived together.")
        val g3 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/dd0f0621-daec-44df-88c0-3b6a4f04ee30", "Pisa, Italy", "13/11/2020", "The Leaning Tower of Pisa, or simply, the Tower of Pisa, is the campanile, or freestanding bell tower, of Pisa Cathedral. It is known for its nearly four-degree lean, the result of an unstable foundation.")
        val g4 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/675c195c-81dd-407c-b181-886671b8af60", "Rome, Italy", "10/11/2020", "Rome is the capital city of Italy. It is also the capital of the Lazio region, the centre of the Metropolitan City of Rome, and a special comune named Comune di Roma Capitale.")
        val g5 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/fccb796f-9fd7-482b-a8a7-92a463a20f5a", "Vatican City, Rome, Italy", "11/11/2020", "The Vatican Museums are the public museums of the Vatican City. They display works from the immense collection amassed by the Catholic Church and the papacy throughout the centuries, including several of the most well-known Roman sculptures and most important masterpieces of Renaissance art in the world.")
        val g6 = Gallery("https://github.com/enesokurterzi/enesokurterzi/assets/113862251/47282714-a9be-43f0-be80-e7a8cb700d24", "Venice, Italy", "15/11/2020", "Venice, the capital of northern Italy’s Veneto region, is built on more than 100 small islands in a lagoon in the Adriatic Sea. It has no roads, just canals – including the Grand Canal thoroughfare – lined with Renaissance and Gothic palaces. The central square, Piazza San Marco, contains St. Mark’s Basilica, which is tiled with Byzantine mosaics, and the Campanile bell tower offering views of the city’s red roofs.")

        resultList.add(g1)
        resultList.add(g2)
        resultList.add(g3)
        resultList.add(g4)
        resultList.add(g5)
        resultList.add(g6)

        return resultList
    }
}