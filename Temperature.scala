object Temperature{
    def convertToFarenheit(C:Double):Double=C*1.8+32
    def main(args:Array[String]):Unit={
        println(convertToFarenheit(35));
    }
}