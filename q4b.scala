import scala.io.StdIn.readInt;

object q4b extends App {
  def profit(ticketPrice: Int, attendance: Int) : Int = ticketPrice*attendance;


  def attendanceChange(ticketPrice: Int) : Int = {
    if(ticketPrice > 15)
      return ((ticketPrice - 15) / 5) * (-20);
    else if(15 > ticketPrice)
      return ((15 - ticketPrice) / 5) * 20;
    else
      return 0;
  }

  def netProfit(ticketPrice: Int, attendance: Int) : Int = {
    return profit(ticketPrice, attendance + attendanceChange(ticketPrice)) - (500 + 3*(attendance + attendanceChange(ticketPrice)));
  }

  print("Enter price of a ticket:");
  var ticketPrice = readInt();
  print("Profit : " + netProfit(ticketPrice, 120));

}
