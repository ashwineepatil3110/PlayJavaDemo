// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Jdbc/PlayJpa-Demo/conf/routes
// @DATE:Tue Jun 16 19:54:57 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
