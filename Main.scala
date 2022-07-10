object Main {

  def takeHomeSalary(wh:Int,oth:Int) ={
    var sal:Double=wh*250+oth*85;
    println(sal-(sal*0.12))
  }
  def main(args: Array[String]): Unit = {
  takeHomeSalary(40,30)
  }
}