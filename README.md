Change the game Civil6 font size.
You can use it in scala REPL:

    :load Civil6ChangeFontSize.scala
    Civil6ChangeFontSize.changeFontSize("F:\\SteamLibrary\\steamapps\\common\\Sid Meier's Civilization VI\\Base\\Assets\\UI\\Fonts\\Civ6_FontStyles_zh_Hans_CN.xml")(4)
    
note changeFontSize's the first argument is your Civil6 font config file, the seconce argument is the offset font size(so can be negative, like -2)
