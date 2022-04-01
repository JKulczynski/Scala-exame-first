object letterValueSum {

  def letterSum(word: String): Int = word.map(_.toInt - 96).sum

}
