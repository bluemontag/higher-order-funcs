package example

object UrlBuilder extends App {


  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  val domainName = "www.example.com"

  def getURL: (String, String) => String = urlBuilder(ssl = true, domainName)

  val endpoint = "users"
  val query = "id=1"
  val url = getURL(endpoint, query)

  println("The result of the getUrl() function is:")
  println(url)
}
