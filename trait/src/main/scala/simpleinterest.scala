trait simpleinterest{
  var interest:Double
  var principle:Int
  var period:Int
  def calc():Double
  def show(): Unit ={
    println("the interest amount is "+calc())
  }
}

class intrst (intr:Double,princ:Int,per:Int) extends simpleinterest{
  override var interest=intr
  override var principle=princ
  override var period=per
  def calc():Double=
  {
    (principle*interest*period)/100

  }
}

object simpleinterest {

def main(args:Array[String]): Unit ={

  val a = new intrst(15,50000,2)

  a.show()

}

}
