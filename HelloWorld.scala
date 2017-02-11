object HelloWorld {
  def main(args: Array[String]): Unit = {
    changeCivil6FontSize("F:\\SteamLibrary\\steamapps\\common\\Sid Meier's Civilization VI\\Base\\Assets\\UI\\Fonts\\Civ6_FontStyles_zh_Hans_CN.xml", 4)
  }

  def changeCivil6FontSize(path: String, fontSizeOffset: Int): Unit = {
    val fileLines = scala.io.Source.fromFile(path).getLines.toList

    val newLines = fileLines.map(o => {
      if(o.contains("FontSize")) {
        val idx = o.indexOf("FontSize")
        val start = idx + 10
        val end = o.indexOf("\"", start)
        val old = o.substring(start, end).toInt
        val newNum = old + fontSizeOffset
        val tail = o.substring(end)
        o.substring(0, start) + newNum + tail
      } else {
        o
      }
    }).toList

    val newLinesString = newLines.mkString("\r\n")
    Some(new java.io.PrintWriter(path)).foreach{p => p.write(newLinesString); p.close}
  }
}

