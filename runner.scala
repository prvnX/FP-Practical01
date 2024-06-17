object runner{
    def easyPaceTime(d:Double):Double=d*8
    def tempoPaceTime(d:Double):Double=d*7
    def totTime(d1:Double,d2:Double,d3:Double):Double=easyPaceTime(d1)+tempoPaceTime(d2)+easyPaceTime(d3)
    def main(args:Array[String]):Unit={
        println("Total time is:"+totTime(2,3,2))
    }
}