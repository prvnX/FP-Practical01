object bookPrice{
    def priceforBooks(n:Int):Double=24.95*n
    def discount(p:Double):Double=p*40/100
    def discountPrice(n:Int):Double=priceforBooks(n)-discount(priceforBooks(n))
    def shippingCost(n:Int):Double={
        if(n<=50)
            3*n
        else
            3*50+ (n-50)*0.75
    }
    def totalCost(n:Int):Double=discountPrice(n)+shippingCost(n)
    
    def main(args:Array[String]):Unit={
        println("Total cost is:"+totalCost(60))
    }
}