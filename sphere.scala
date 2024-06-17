object sphere{
    def calculateVolume(r:Double):Double=(4/3)*Math.PI*r*r*r
    def main(args:Array[String]):Unit={
        println(calculateVolume(5))
    }
}